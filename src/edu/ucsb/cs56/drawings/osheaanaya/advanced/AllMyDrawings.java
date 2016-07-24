package edu.ucsb.cs56.drawings.osheaanaya.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author O'shea Anaya
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pizzas 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pizza p1 = new Pizza(100,200,50);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black pizza that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a pizza that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two pizzas with pepperoni
	
	PizzaWithPepperoni pwp1 = new PizzaWithPepperoni(150,350,75);
	PizzaWithPepperoni pwp2 = new PizzaWithPepperoni(400,350,100);
	
	g2.draw(pwp1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pwp2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pizzas by O'shea Anaya", 20,20);
    }
    
    
    /** Draw a picture with more pizzas
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some pizzas.
	
	Pizza p1 = new Pizza(200,100,75);
	Pizza p2 = new Pizza(100,150,30);
	
	g2.setColor(Color.RED);     g2.draw(p1);
	g2.setColor(Color.GREEN);   g2.draw(p2);
	
	
	// Make a black pizza that's half the size, 
	// and moved over 200 pixels in x direction
	Shape p3 = ShapeTransforms.scaledCopyOfLL(p2,0.5,0.5);
	p3 = ShapeTransforms.translatedCopyOf(p3,200,0);
	g2.setColor(Color.BLACK); g2.draw(p3);
	
	// Here's a pizza that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p3 = ShapeTransforms.scaledCopyOfLL(p3,4,4);
	p3 = ShapeTransforms.translatedCopyOf(p3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p3); 
	
	// Draw two pizzas with pepperoni
	
	PizzaWithPepperoni pwp1 = new PizzaWithPepperoni(150,350,95);
	
	g2.draw(pwp1);
	g2.setColor(new Color(0x8F00FF)); 

	
	// Rotate the second pizza 45 degrees around its center.
	Shape pwp2 = ShapeTransforms.rotatedCopyOf(pwp1, Math.PI/4.0);
	pwp2 = ShapeTransforms.translatedCopyOf(pwp2,200,0);
	g2.draw(pwp2);

	Shape pwp3 = ShapeTransforms.scaledCopyOfLL(pwp2,0.5,0.5);
	pwp3 = ShapeTransforms.translatedCopyOf(pwp3,250,0);
	g2.setColor(Color.CYAN); g2.draw(pwp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Pizzas by O'shea Anaya", 20,20);
    }
    
    /** Draw a different picture with pizzas
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A different batch of Pizzas by O'shea Anaya", 20,20);
	
	
	// Draw some pizzas
	
	Pizza large = new Pizza(100,50, 15);
	Pizza smallP = new Pizza(200,200,80);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallP);

	PizzaWithPepperoni hw1 = new PizzaWithPepperoni(450,280,100);
	g2.draw(hw1);
	
    }	

}
