package C20729449;

import ddf.minim.Minim;

import java.util.ArrayList;

import ddf.minim.AudioPlayer;
import ie.tudublin.*;
import ie.tudublin.Visual;


    

    public class Visuals extends Visual
{
   // Lights light;
    Line line;
    Cube cube;
    Spectrum spec;
    Circle circle;
    RotatingBands rb;
    Spiral spiral;


    Minim minim;
    AudioPlayer player;
    Visual visual;
    
    

    public void settings()
    {
        size(1024, 1000,P3D);
        
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Mario.mp3");  
        player = this.getAudioPlayer();
        
        
        circle = new Circle(this);
        line = new Line(this);
        cube = new Cube(this);
        spec = new Spectrum(this);
        rb = new RotatingBands(this);
        spiral = new Spiral(this);

        visual = line;
        
    
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
        if (key == '1')
        {
            visual=line;
        }
        if (key == '2')
        {
            visual=cube;
        }
        if (key == '3')
        {
            visual=circle;
        }
        if (key == '4')
        {
            visual=spec;
        }
        if (key == '5')
        {
            visual=rb;
        }
        if (key == '6')
        {
            visual=spiral;
        }
    }

    public void draw()
    {
        
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
        visual.draw();
       
        
    }
}


