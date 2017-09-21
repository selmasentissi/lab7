// Selma Sentissi EL Idrissi 

import java.io.File;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class SeatMap 
{      
	 String [] [] studentName = new String [6][5];
   
	 public static void readFile() 
	    {
			try 
			{
			    File inputFile = new File("names.dat");
			     Scanner input = new Scanner(inputFile);    
			 }//end try 
				
				catch (IOException e)
			    {
				    System.err.println("IOException in reading input file!!!");
				}//end catch 
          }//end readFile
	  
	  public void populateArray(int row , int col , String name)
	  {    for (row  = 0; row < 6 ; row++ )
		  {
			  for (col = 0 ; col < 5 ; col++)	  
			  { String waw = null;
			  studentName [row][col] = waw;	
			  }
		  }// end for 
	  getSeat(seatt);
	  }// end populateArray
	  
	  public static void getSeat (int seat)
	  {
		  Scanner console = new Scanner (System.in);
		  System.out.print("Input of a seat");
		  seat = console.nextInt();	
		  int seatt = Integer.parseInteger(seat);
		  
		  
	  }// end getSeat 
	
	public static void main(String[] args) 
	{
		 SeatMap  seat = new SeatMap();
	}//end main

}// end SeatMap class
