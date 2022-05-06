package C20729449;

import ie.tudublin.Visual;

public class Circle extends Visual {


    Visuals mv;
    

    public Circle(Visuals mv)
    {
        this.mv = mv;
    }

    int radius = 200;
    float rad = 60;


    public void draw() {
        mv.camera();
        mv.noStroke();
        mv.rect(0, 0, mv.width, mv.height);
        mv.translate(mv.width/2, mv.height/2);
        mv.noFill();

        int bufferSize = mv.getAudioBuffer().size();
        for (int i = 0; i < bufferSize - 1; i += 20) {
            rad = rad + 0.9f * mv.getAudioBuffer().get(i);
            mv.ellipse(0, 0, 2 * rad, 2 * rad);

            float x1 = (radius) * cos(i * 2 * PI / bufferSize);
            float y1 = (radius) * sin(i * 2 * PI / bufferSize);
            float x2 = (radius + mv.getAudioBuffer().get(i) * 400) * cos(i * 2 * PI / bufferSize);
            float y2 = (radius + mv.getAudioBuffer().get(i) * 400) * sin(i * 2 * PI / bufferSize);
            mv.strokeWeight(9);
            mv.stroke(random(0, 255), random(0, 255), random(0, 255));
            mv.line(x1, y1, x2, y2);
        }


        mv.fill(0);
    }

    
}
