import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


public void setup()
{
	background(0);
  size(300,300);
}



public void draw()
{ 
		int myStartX = 0;
		int myStartY = 0;
		
		while (myStartX<300)
	{		

		int mycolour= (int)(Math.random()*200);
		strokeWeight(5);
		stroke(mycolour,mycolour, mycolour);
		
		int myEndX = myStartX + (int)(Math.random()*50);
		int myEndY = myStartY + (int)(Math.random()*150);
		line (myStartX, myStartY, myEndX, myEndY);
		myStartX = myEndX ;
		myStartY = myEndY ;
	}	

}
public void mousePressed()
{
	redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
