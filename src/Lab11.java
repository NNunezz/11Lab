
// Lab11Bst.java
// The Graphics Array
// This is the student, starting file for Lab 11B.

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Lab11 extends Applet
{
	private int numBars;	// number of bars to be displayed
	int barHeight[];		// array of bar heights
	int swapDelay;          // The delay between the original display and the second display.
	int bar1, bar2;         // Indexes of 2 bars to be swapped.

	public void init()
	{
		numBars = enterIntGUI("How many bars will be displayed?  {1-1000}");
		bar1 = enterIntGUI("What is the index of the 1st bar to be swapped?  {0-"+(numBars-1)+"}");
		bar2 = enterIntGUI("What is the index of the 2nd bar to be swapped?  {0-"+(numBars-1)+"}");
		swapDelay = 3000;
		barHeight = new int[numBars];
		getBarValues();		
	}

	public void getBarValues()
	{
		barHeight = new int[numBars];
		for (int k = 0; k < numBars; k++)
		     barHeight[k] = Expo.random(10, 640);
	
	}
	
	public void paint(Graphics g) 	
	{
		displayBars(g);
		Expo.delay(swapDelay);
		swapBars(bar1,bar2);
		Expo.setBackground(g,Expo.white);
		displayBars(g);			
	}

	public static int enterIntGUI(String prompt)  
				// Allows GUI keyboard input of an integer in a graphics program.
	{
		String tempString = JOptionPane.showInputDialog(prompt);
		int temp = Integer.parseInt(tempString);
		return temp;
	}	
			

	public void displayBars(Graphics g)
	{ 	
		int x1 = 1;
	    int x2 = 1;
	    int y1 = 0;
	    Expo.setColor(g,Expo.darkRed);
	    for (int k = 0; k <= numBars; k++)
	    {
	    	x1 += 1;
	    	x2 += 1;
	    	y1 = 640 - barHeight[k];
	    	Expo.drawLine(g, x1, y1, x2, 640);
	    }
	} 	

  	private void swapBars(int x, int y)
  	{
  		
	}

}    