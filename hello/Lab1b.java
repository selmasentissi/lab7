package lab1;

/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab1b {
    
    // data members
	
    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
     * @throws FileNotFoundException 
    */
	 public Lab1b(String filename) 
	        {
			readFile(filename);
		    }// end Constructor 
	
	 
	/**stores the data retrieved from the file */
    Vector <Double> doubleVector; 
    

    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     * @throws FileNotFoundException 
     */
    
    //Method description here 
    public void readFile(String filename) {
    	
	try {
		File inputFile = new File(filename);
	Scanner input = new Scanner(inputFile);
		
		// store all elements in a vector
	
	double elt = 0; 
	int count = 0;
	double sum = 0;
	
	doubleVector = new Vector<Double>();
	
	    while (input.hasNext()) 
	    { 
	    	
	    elt = input.nextDouble();
	    doubleVector.addElement(elt);
		count++;
		sum = sum + elt;
	    }
	    System.out.printf("The average is ", sum);
	    input.close();
	    
	   
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	   
    } //end readFile()
    
    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	   new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
