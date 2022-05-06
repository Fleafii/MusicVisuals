package ie.tudublin;

import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;
import C20729449.*;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
		//CubeVisual cube = new CubeVisual();
		//cube.start();
        processing.core.PApplet.runSketch( a, new Visuals());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		
		main.startUI();			
	}
}