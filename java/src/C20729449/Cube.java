package C20729449;

import ie.tudublin.Visual;
import processing.core.PApplet;

public class Cube extends Visual {


    float smoothedBoxSize = 0;
    float angle = 0;

    Runner mv;
   

    public Cube(Runner mv)
    {
        this.mv = mv;
    }

    public void draw() {
        mv.background(0);
        mv.colorMode(PApplet.HSB);
        mv.calculateAverageAmplitude();
        
        mv.noFill();
        mv.lights();
        mv.stroke(map(mv.getSmoothedAmplitude(), 0, 1, 0, 1000), 255, 255);
        mv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        mv.translate(0, 0, -250);

        float boxSize = 20 + (mv.getAmplitude() * 100);//map(average, 0, 1, 100, 400);
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);

        mv.pushMatrix();
        mv.translate(-100, 0, 0);
        mv.rotateY(angle);
        mv.rotateX(angle);
        mv.box(smoothedBoxSize);

        mv.popMatrix();
        mv.pushMatrix();
        mv.translate(100, 0, 0);
        mv.rotateY(angle);
        mv.rotateX(angle);
        mv.strokeWeight(5);
        mv.box(smoothedBoxSize);

        mv.popMatrix();
        mv.pushMatrix();
        mv.translate(0, -100, 0);
        mv.rotateY(angle);
        mv.rotateX(angle);
        mv.strokeWeight(5);
        mv.box(smoothedBoxSize);

        mv.popMatrix();
        mv.pushMatrix();
        mv.translate(0, 100, 0);
        mv.rotateY(angle);
        mv.rotateX(angle);
        mv.strokeWeight(5);
        mv.box(smoothedBoxSize);

        mv.popMatrix();
        mv.rotateY(angle);
        mv.rotateX(angle);
        mv.strokeWeight(5);
        mv.box(smoothedBoxSize);

        angle += 0.01f;
    }

   

} 