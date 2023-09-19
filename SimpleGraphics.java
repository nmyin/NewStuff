/**
 *	SimpleGraphics.java
 *
 *	To compile Linux:	javac -cp .:acm.jar SimpleGraphics.java
 *	To execute Linux:	java -cp .:acm.jar SimpleGraphics
 *	To compile MS Powershell:	javac -cp ".;acm.jar" SimpleGraphics.java
 *	To execute MS Powershell:	java -cp ".;acm.jar" SimpleGraphics
 *
 *	@author	Nishka Yadav
 *	@since	9/19/2023
 */
 
/*	All package classes should be imported before the class definition.
 *	"java.awt.Color" means package java.awt contains class Color. */
import java.awt.Color;

/*	The following libraries are in the acm.jar file. */
import acm.program.GraphicsProgram;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.graphics.GRectangle;

public class SimpleGraphics extends GraphicsProgram {
	
	/*	All fields and constants should be declared here.
	 *	Only constants (final) are initialized here. */
	private GOval circle;
	private final double RADIUS = 50;
	
	private GRect square;
	private final double SIDE = 40;
	
	/**	The init() method is executed before the run() method.
	 *	All initialization steps should be performed here.
	 */
	public void init() {

	}
	
	/**	The run() method is executed after init().
	 *	The bulk of the program should be performed here.
	 *	Exercise hint: Use one-dimensional arrays for the GOval's and GRect's.
	 */
	public void run() {
		GOval[] circles = new GOval[5];
		for (int i = 0; i < 5; i++){
			GOval circles[i] = new GOval(RADIUS*(i-1), RADIUS*(i-1), RADIUS*(5-i), RADIUS*(5-i));
			circle.setFilled(true);
			if (i%2 == 0)
				circles[i].setFilledColor(Color.RED);
			else
				circles[i].setFilledColor(Color.WHITE);
			add(circles[i]);
			
		}
		/*
		GOval circle = new GOval(-25, -25, RADIUS * 5, RADIUS * 5);
		circle.setFilled(true);
		circle.setFillColor(Color.RED);
		
		GOval circle2 = new GOval(0, 0, RADIUS * 4, RADIUS * 4);
		circle2.setFilled(true);
		circle2.setFillColor(Color.WHITE);
		
		GOval circle3 = new GOval(25, 25, RADIUS * 3, RADIUS * 3);
		circle3.setFilled(true);
		circle3.setFillColor(Color.RED);
		
		GOval circle4 = new GOval(50, 50, RADIUS * 2, RADIUS * 2);
		circle4.setFilled(true);
		circle4.setFillColor(Color.WHITE);
		
		GOval circle5 = new GOval(75, 75, RADIUS * 1, RADIUS * 1);
		circle5.setFilled(true);
		circle5.setFillColor(Color.RED);
		
		square = new GRect(300, 100, SIDE, SIDE);
		square.setFilled(true);
		square.setFillColor(Color.BLUE);
		
		add(circle);
		add(circle2);
		add(circle3);
		add(circle4);
		add(circle5);
		add(square);*/
	}
}
