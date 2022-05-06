package C20729449;

import ddf.minim.Minim;

import ddf.minim.AudioPlayer;
import ie.tudublin.*;
import ie.tudublin.Visual;


    

    public class Runner extends Visual
{
    // creates the varrible to store the objects
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
        size(1024, 860,P3D);
        
    }

    public void setup()
    {
        setFrameSize(1024);
        frameRate(60);


        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Mario.mp3");  
        player = this.getAudioPlayer();
        
        // creating the visuals
        circle = new Circle(this);
        line = new Line(this);
        cube = new Cube(this);
        spec = new Spectrum(this);
        rb = new RotatingBands(this);
        spiral = new Spiral(this);

        //creating the visual that uses polymorphism to call the .draw() method
        visual = line;
        
    
    }

    // keys 1-6 change the current visual being displayed
    // spacebar starts the music
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
            // sets visual thats to be drawn to the users choice.
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
        //sets background to black
        background(0);
        try
        {
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        
        calculateFrequencyBands(); 
        calculateAverageAmplitude();
        visual.draw();
       
        
    }
}


