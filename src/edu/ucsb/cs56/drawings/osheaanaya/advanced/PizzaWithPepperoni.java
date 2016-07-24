package edu.ucsb.cs56.drawings.osheaanaya.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A Pizza
      
   @author O'shea Anaya 
   @version for CS56, UCSB
   
*/
public class PizzaWithPepperoni extends Pizza implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public PizzaWithPepperoni(double x, double y, double radius)
    {
	// construct the basic house shell
	super(x,y,radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make the pepperonis

	double w = 0.2 * radius; 
	double r = 0.2 * radius;
	
	Ellipse2D.Double pepp1 =
	    new Ellipse2D.Double(x + w, y + w, r, r);
	Ellipse2D.Double pepp2 =
	    new Ellipse2D.Double(x + 2.3*w, y + 1.15*w, r, r);
	Ellipse2D.Double pepp3 =
	    new Ellipse2D.Double(x - 0.8* w, y - 1.7*w, r, r);
	Ellipse2D.Double pepp4 =
	    new Ellipse2D.Double(x - 2.4* w, y + 0.66*w, r, r);
	Ellipse2D.Double pepp5 =
	    new Ellipse2D.Double(x - 4.1* w, y - w, r, r);
	Ellipse2D.Double pepp6 =
	    new Ellipse2D.Double(x - 2.3*w, y + 3.01*w, r, r);
	Ellipse2D.Double pepp7 =
	    new Ellipse2D.Double(x - 2.2* w, y - 3.3*w, r, r);
	Ellipse2D.Double pepp8 =
	    new Ellipse2D.Double(x + 2.1 * w, y - 3.05*w, r, r);
	Ellipse2D.Double pepp9 =
	    new Ellipse2D.Double(x + 2.1 * w, y - 1.05*w, r, r);
	Ellipse2D.Double pepp10 =
	    new Ellipse2D.Double(x + 0.6 * w, y - 3.5*w, r, r);
	Ellipse2D.Double pepp11 =
	    new Ellipse2D.Double(x + 0.5 * w, y + 2.5*w, r, r);
	Ellipse2D.Double pepp12 =
	    new Ellipse2D.Double(x - 2.8 * w, y - 2.0*w, r, r);

	
	// add pepperoni to the pizza
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(pepp1, false);
        wholePizza.append(pepp2, false);
        wholePizza.append(pepp3, false);
	wholePizza.append(pepp4, false);
	wholePizza.append(pepp5, false);
        wholePizza.append(pepp6, false);
	wholePizza.append(pepp7, false);
	wholePizza.append(pepp8, false);
	wholePizza.append(pepp9, false);
	wholePizza.append(pepp10, false);
	wholePizza.append(pepp11, false);
	wholePizza.append(pepp12, false);	
    }    
}
