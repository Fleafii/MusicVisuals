package example;

import ie.tudublin.Visual;
import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm extends Visual
{
    MyVisual mv;
    float cy = 0;
    float cx = 0;

    public WaveForm(MyVisual mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
        cx = this.mv.width /2;
    }

    public void render()
    {   
        float random = 15;
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
           // mv.stroke(PApplet.map(i, 0, 0, 0, 0)  , 0  , 0);
                

            //mv.line(i+random, cy, i, cy + cy * mv.getAudioBuffer().get(i));
            //mv.line(i-100-random, cy + cy * mv.getAudioBuffer().get(i), i+100+random, cx);
            //mv.line(i, cy , i , cy);
            random = cx * mv.getAudioBuffer().get(i);
            //mv.arc(cx, cy, 200 + random, 200 + random, 200, 300);
            
               // mv.arc(cx, cy, 200 + random, 200 + random, 200, 300);
            
            
                //mv.line(i  , cy + random , i , cy );
            
            
            mv.arc(cx, cy, 300 , 50 + 150 * mv.getAudioBuffer().get(i) , 250, 300);
            mv.fill(255, 255, 100 + 255 );
            mv.arc(cx - 100, cy - 150, 75 + 15 * mv.getAudioBuffer().get(i) , 75 + 15 * mv.getAudioBuffer().get(i) , 50, 100);
            mv.arc(cx + 100, cy - 150, 75 + 15 * mv.getAudioBuffer().get(i) , 75 + 15 * mv.getAudioBuffer().get(i) , 50, 100);
            

           // mv.rect(100, 100, 100, 100);
           // mv.rect(400, 400, 100, 100);
            
           
            

            //mv.line(i , i , i , i);
            
        }
    }
}