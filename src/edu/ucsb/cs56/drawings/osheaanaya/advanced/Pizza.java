package edu.ucsb.cs56.drawings.osheaanaya.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D; 

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pizza that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author O'shea Anaya 
   @version for CS56, UCSB
   
*/
public class Pizza extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width
       @param height of house (including first story and second story)
    */
    public Pizza(double x, double y, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	Ellipse2D.Double crust =
	    new Ellipse2D.Double (x - radius, y - radius,   /* upper left corner of bounding box */
				  radius * 2, radius * 2); /* width and height are double the radius */
	Ellipse2D.Double innerPizza =
	    new Ellipse2D.Double (x - radius + 0.1*radius, y - radius + 0.1*radius,
				  radius * 1.8, radius *1.8);

        Line2D.Double pizzaCross1 = 
            new Line2D.Double (x-radius, y,
                               x+radius, y);
	
        Line2D.Double pizzaCross2 = 
            new Line2D.Double (x, y-radius,
                               x, y+radius);
	
       Line2D.Double pizzaCross3 = 
	   new Line2D.Double (x-radius*.7, y-(radius*.7),
                               x+radius*.7, y+(radius*.7));

       Line2D.Double pizzaCross4 = 
	   new Line2D.Double (x-radius*.7, y+(radius*.7),
                               x+radius*.7, y-(radius*.7));
       
	GeneralPath wholePizza = this.get();
	wholePizza.append(pizzaCross1, false);
	wholePizza.append(pizzaCross2, false);
	wholePizza.append(pizzaCross3, false);
	wholePizza.append(pizzaCross4, false);
	wholePizza.append(crust, false);
	wholePizza.append(innerPizza, false);
    }
}
