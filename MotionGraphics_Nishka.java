/**
 *	MotionGraphics_Nishka.java
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

public class MotionGraphics_Nishka extends GraphicsProgram {
	
	/*	All fields and constants should be declared here.
	 *	Only constants (final) are initialized here. */
	 
	 
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
		GRect square = new GRect (480, 280, 20, 20);
		square.setFilled(true);
		square.setFillColor(Color.GREEN);
		add(square);
		
		
		GOval circle = new GOval (100, 100, 40, 40);
		circle.setFilled(true);
		circle.setFillColor(Color.RED);
		add(circle);
		
		GPolygon arrow = new GPolygon ();
		arrow.addVertex(200,200);
		arrow.addEdge(0, 10);
		arrow.addEdge(20, 0);
		arrow.addEdge(0, 5);
		arrow.addEdge(5,-5);
		arrow.addEdge(-5,-5);
		arrow.addEdge(0,5);
		arrow.addEdge(-20,0);
		arrow.setFilled(true);
		arrow.setFillColor(Color.GREEN);
		
		addMouseListeners(EventListener listener);
		
	}
}
