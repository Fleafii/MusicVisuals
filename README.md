# Music Visualiser Project

# Group Members
Name: Fiachra Dowling
Student Number: C20729449

Name: Micolaj Chanas
Student Number: C20724761

# Video Of Our Visualisations
[https://youtu.be/3xIj44_mM5E]


# Description of the assignment
The App we made plays a piece of music and visualises it to the screen. simple shapes are drawn to the screen . then based on the amplitude of the beat we have made it so they change shape, colour , intensity or movement speed.

# Instructions
Start the program by running main.java.
The default visual is set to key 1
Press spacebar to start the music or restart the song.
Keys 1 - 6 change which visual is presented on screen.

# How it works
The Runner.java file is the backbone of the application.
the Runner class is a subclass of Visual and also has 6 of objects that extend visual(Circle,Cube,Line,RotatingBands,Spectrum,Spiral).
This lets them overwride the Draw() method so that they can be used polymorphically under a Parent Visaul variable we have named visual.
this Visual varrible can store the address of any of the 6 Visuals we have created and is set to Line by deafult. When the "2" key is pressed the Visual varrible is redirected to point at the instance of Cube. 
so when visual.draw() is called again the Cube object will now be drawn instead of the Line object.


# What I am most proud of in the assignment
The part of the project I’m most happy with is the RotatingBands pattern, which I adapted from the 
starter code patterns. I added the Cuboids in circles to the pattern and added rotation and color changes 
based on the audio input buffer. This was a bit hard at first to calculate the logic, but I managed to do it 
properly in the end. It also changes the cuboid height according to the audio input

