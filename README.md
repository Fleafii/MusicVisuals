# Music Visualiser Project

# Group Members
Name: Fiachra Dowling
Student Number: C20729449

Name: Micolaj Chanas
Student Number: C20724761


# Description of the assignment
The App we made plays a piece of music and visualises it to the screen. simple shapes are drawn to the screen . then based on the amplitude of the beat we have made it so they change shape, colour , intensity or movement speed.

# Instructions
Start the program by running main.java.
The default visual is set to key 1
Press spacebar to start the music or restart the song.
Keys 1 - 6 change which visual is presented on screen.

# How it works
The main visuals.java file is called when main starts.
6 objects are made in the visuals class (Circle,Cube,Line,RotatingBands,Spectrum,Spiral) each of these classes are also subclasses of visual. 

# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```image

This is an  using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

