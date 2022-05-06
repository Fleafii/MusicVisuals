package C20729449;

import ie.tudublin.Visual;
import processing.core.PApplet;


public class Line extends Visual
{
    Runner mv;

    public Line(Runner mv)
    {
        this.mv = mv;
    }

    int mode = 0;
    float average = 0;

    public void draw()
    {   
        mv.colorMode(PApplet.HSB);
        mv.background(0);
        mv.camera();
        
        mv.pushMatrix();
        mv.translate(0, 200, 0);
        
        for (int j = 0; j < 3; j+=1) {
            float centerY = mv.height / 2;
            float sum = 0;
            for (int i = 0; i < mv.getAudioBuffer().size(); i+=10) {
                mv.stroke(map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
                mv.line(i, centerY, i, centerY + mv.getAudioBuffer().get(i) * centerY);
                sum += abs(mv.getAudioBuffer().get(i));
            }
            average = sum / mv.getAudioBuffer().size();

            float ellipseWidth = average * 5000;
            mv.noStroke();
            mv.fill(map(average, 0, 1, 0, 255), 255, 255);
            mv.ellipse(mv.width / 4, centerY, ellipseWidth, ellipseWidth);
            mv.ellipse(3 * mv.width / 4, centerY, ellipseWidth, ellipseWidth);
            mv.translate(0, -400, 0);
        }

        mv.popMatrix();
        mv.rotate((float) (PI/2.0));
        mv.translate(0, -600, 0);
        for (int j = 0; j < 3; j+=1) {
            float centerY = mv.height / 2;
            float sum = 0;
            for (int i = 0; i < mv.getAudioBuffer().size(); i+=10) {
                mv.stroke(map(i, 0, mv.getAudioBuffer().size(), 0, 255), 255, 255);
                mv.line(i, centerY, i, centerY + mv.getAudioBuffer().get(i) * centerY);
                sum += abs(mv.getAudioBuffer().get(i));
            }
            average = sum / mv.getAudioBuffer().size();

            float ellipseWidth = average * 5000;
            mv.noStroke();
            mv.fill(map(average, 0, 1, 0, 255), 255, 255);
            mv.ellipse(mv.width / 4, centerY, ellipseWidth, ellipseWidth);
            mv.ellipse(3 * mv.width / 4, centerY, ellipseWidth, ellipseWidth);
            mv.translate(0, -600, 0);
        }
    }
}     

