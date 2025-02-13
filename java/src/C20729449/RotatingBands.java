package C20729449;

import ie.tudublin.Visual;

public class RotatingBands extends Visual {

    Runner mv;

    public RotatingBands(Runner mv)
    {
        this.mv = mv;
  
    }

    float[] radius = {100, 200, 300, 400};
    float rot = 0;

    public void draw(){

        mv.calculateAverageAmplitude();
        
        mv.calculateFrequencyBands();
        
        mv.noFill();
        mv.stroke(255);
        mv.lights();
        mv.stroke(map(mv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        mv.camera(0, -500, 500, 0, 0, 0, 0, 1, 0);

        rot += mv.getAmplitude() / 20.0f;

        float[] bands = mv.getSmoothedBands();
        for (int r = 0; r < 4; r++) {
            mv.rotateY(rot * -1 * (r + 1));
            for(int i = 0 ; i < bands.length ; i ++){
                float theta = map(i, 0, bands.length, 0, TWO_PI);

                mv.stroke(map(i, 0, bands.length, 0, 255), 255, 255);
                float x = sin(theta) * radius[r];
                float z = cos(theta) * radius[r];
                float h = bands[i];
                mv.pushMatrix();
                mv.translate(x, - h / 2 , z);
                mv.rotateY(theta);
                mv.strokeWeight(8);
                mv.box(50, h, 50);
                mv.popMatrix();
            }
        }
    }

   
}