
void setup()
{
	background(0);
  size(300,300);
}



void draw()
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
void mousePressed()
{
	redraw();
}

