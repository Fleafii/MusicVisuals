package C20729449;

import ie.tudublin.Visual;

public class Spectrum extends Visual {

    
    int radius = 150;

    Visuals mv;
    float cy = 0;
    float cx = 0;

    public Spectrum(Visuals mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
        cx = this.mv.width /2;
    }

    public void draw() {

        mv.camera();    // resets the camera
        mv.noStroke();
        mv.rect(0, 0, mv.width, mv.height);
        mv.translate(mv.width/2, mv.height/2);
        mv.noFill();
        mv.fill(-1, 10);


        int bufferSize = mv.player.bufferSize();
        for (int i = 0; i < bufferSize - 1; i+=15) {
            float x1 = (radius)*cos(i*2*PI/bufferSize) * 5;
            float y1 = (radius)*sin(i*2*PI/bufferSize) * 5;
            float x2 = (radius + mv.player.left.get(i)*100)*cos(i*2*PI/bufferSize);
            float y2 = (radius + mv.player.left.get(i)*100)*sin(i*2*PI/bufferSize);
            mv.stroke(random(0,255),random(0,255),random(0,255));
            mv.strokeWeight(6);
            mv.line(x1, y1, x2, y2);
        }
        mv.fill(0);

        mv.beginShape();

        for (int i = 0; i < bufferSize; i+=30) {
            float x2 = (radius + mv.player.left.get(i)*100)*cos(i*2*PI/bufferSize);
            float y2 = (radius + mv.player.left.get(i)*100)*sin(i*2*PI/bufferSize);

            mv.strokeWeight(2);
            mv.vertex(x2, y2);
            mv.pushStyle();
            mv.stroke(-1);
            mv.strokeWeight(20);
            mv.point(x2, y2);
            mv.popStyle();
        }
        mv.endShape();
    }

   
}
