package C20729449;

import ie.tudublin.Visual;
import processing.core.*;

import ddf.minim.analysis.FFT;
import processing.core.PApplet;

/*

The infinite number of waves make up the mind, and all minds are made up of these waves which then interact with one another to form reality via Fourier transformations
Science is not supposed to give meaning to ones life or the reason behind their existence; science only explains the testable and provable mechanisms that run the universe

*/

public class Lights extends Visual
{
    Visuals mv;
    float cy = 0;
    float cx = 0;

    public Lights(Visuals mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
        cx = this.mv.width /2;
    }

    int mode = 0;

    float[] lerpedBuffer;
    float y = 0;
    float smoothedY = 0;
    float smoothedAmplitude = 0;

    FFT fft;
    float off = 0;
    int radius = 150;

    

    public void draw()
    {   
        
        mv.colorMode(PApplet.HSB);
        mv.camera();
        int k = 50;
        mv.noFill();

        
        mv.arc(cx, cy, 500 , 500 , 50, 100);        
        mv.noFill();
        
        for(int i = 0 ; i < mv.getAudioBuffer().size()-1 ; i += 20)
        {   
            k+=50;

            //stroke(ab.get(i)%255);
            mv.stroke(255,abs(mv.getAudioBuffer().get(i)*500)+100,abs(mv.getAudioBuffer().get(i)*500)+100);
            mv.strokeWeight(5);
            //stroke(255, 255-c20, 0);

            //i - i/2 and i/2 - i splits the screen to work accros each other
            mv.line(cx - 130 + i/5,cy - 50 + mv.getAudioBuffer().get(i)*k/8,cx - 130 + i/2/5, cy - 60);
            mv.line(cx - 130 + i/2/5,cy - 50 + mv.getAudioBuffer().get(i)*k/8,cx - 130 + i/5, cy - 60);
        
    
            //i - i/2 and i/2 - i splits the screen to work accros each other, /right eye
            mv.line(cx + 50 + i/5,cy - 50 - mv.getAudioBuffer().get(i)*k/8,cx + 50 + i/2/5, cy - 60);
            mv.line(cx + 50 + i/2/5,cy - 50 - mv.getAudioBuffer().get(i)*k/8,cx + 50 + i/5, cy - 60);
            
            
             mv.line(cx +i/2 - 125, (cy + 70 + mv.getAudioBuffer().get(i) * 75),cx +i/2 - 125, cy + 70 );
             mv.line(cx +i/2 - 125, cy + 70 + mv.getAudioBuffer().get(i) * 75,cx + i/2 - 125,cy + 70);
            
        
    }
    }     
}