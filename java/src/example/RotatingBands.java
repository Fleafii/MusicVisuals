package example;

import ie.tudublin.*;
import processing.core.*;

// This is an example of a visual that renders the waveform
public class RotatingBands extends Visual
{
    MyVisual mv;
    float cy = 0;

    float radius = 200;

    float smoothedBoxSize = 0;

    float rot = 0;

    float angle = 0;

    public RotatingBands(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
    }

    public void render()
    {
        mv.calculateAverageAmplitude();
        try
        {
            mv.calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
        mv.background(0);
        mv.noFill();
        mv.stroke(255);
        mv.lights();
        mv.stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        mv.camera(0, -500, 500, 0, 0, 0, 0, 1, 0);
        //translate(0, 0, -250);

        rot += getAmplitude() / 8.0f;

        mv.rotateY(rot);
        float[] bands = mv.getSmoothedBands();
        for(int i = 0 ; i < bands.length ; i ++)
        {
            float theta = map(i, 0, bands.length, 0, TWO_PI);

            mv.stroke(map(i, 0, bands.length, 0, 255), 255, 255);
            float x = sin(theta) * radius;
            float z = cos(theta) * radius;
            float h = bands[i];
            mv.pushMatrix();
            mv.translate(x, - h / 2 , z);
            mv.rotateY(theta);
            mv.box(50, h, 50);
            mv.popMatrix();
        }
    }
}