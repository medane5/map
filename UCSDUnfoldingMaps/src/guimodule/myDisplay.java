package guimodule;

import processing.core.PApplet;

public class myDisplay extends PApplet {
	
	public void setup()
	{
       size(400,400);
       background(250,25,5);
		
	}
	
	public void draw()
	{
		fill(130, 246, 234);
		ellipse(200, 200, 375, 375);
		fill(0,0,0);
		ellipse(100,100,60,80);
		fill(0,0,0);
		ellipse(300,100,60,80);
			noFill();
		arc(200, 280, 100, 70, 0,PI);
	
		
		
	}

}
