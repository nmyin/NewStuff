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
		setSize(1000, 600);
	}
	
	/**	The run() method is executed after init().
	 *	The bulk of the program should be performed here.
	 *	Exercise hint: Use one-dimensional arrays for the GOval's and GRect's.
	 */
	public void run() {
		GOval[] circles = new GOval[5];
		for (int i = 0; i < 5; i++){
			circles[i] = new GOval((RADIUS*i)+500, (RADIUS*i)+450, RADIUS*(5-i), RADIUS*(5-i));
			circles[i].setFilled(true);
			if (i%2 == 0)
				circles[i].setFillColor(Color.RED);
			else
				circles[i].setFillColor(Color.WHITE);
			add(circles[i]);	
		}
		
		GRect[] bricks = new GRect[10];
		for (int j = 0; j < 10; j++){
			for (int k = (9-j); k > -1; k--){
				bricks[k] = new GRect(500, (j*10)+10, 50, 20);
				bricks[k].setFilled(false);
				add(bricks[k]);
			}
		}
	}
}
