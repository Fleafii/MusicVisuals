package C20729449;

import ie.tudublin.Visual;


public class Spiral extends Visual {


    float smoothedBoxSize = 0;
    float angle = 0;

    Visuals mv;


    public Spiral(Visuals mv)
    {
        this.mv = mv;
    }

    public void draw() {
        mv.camera();
        mv.noStroke();
        mv.rect(0, 0, mv.width, mv.height);
        mv.noFill();
        mv.fill(-1, 10);

        int bufferSize = mv.getAudioBuffer().size();
        for (int i = 0; i < bufferSize - 1; i++) {

            mv.translate(map(i, 0, bufferSize, 0, width), map(i, 0, bufferSize, 0, height));
            float x1 = (mv.getAudioBuffer().get(i))*cos(i*2*PI/bufferSize);
            float y1 = (mv.getAudioBuffer().get(i))*sin(i*2*PI/bufferSize);
            float x2 = (mv.getAudioBuffer().get(i) + mv.getAudioBuffer().get(i)*400)*cos(i*2*PI/bufferSize);
            float y2 = (mv.getAudioBuffer().get(i) + mv.getAudioBuffer().get(i)*800)*sin(i*2*PI/bufferSize);
            mv.stroke(random(0,255),random(0,255),random(0,255));
            mv.strokeWeight(2);
            mv.ellipse(x1, y1, x2, y2);
        }
        mv.fill(0);
    }

}