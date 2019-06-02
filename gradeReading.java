// Cathrine Bien-Aime
 

import java.io.*;
import java.util.Scanner;
public class Javagrades {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/* 
 * Create a program that uses an indefinite loop to read in the data from the file “grades.txt”.  
 * As you read in each integer, use a selection structure to count number of 
 * As, Bs, Cs, Ds and Fs based on the following scale:
 * 
 * After the values have been read in, display the count for each letter grade on the screen. 
 
 */
	

/* THe numbers:
 *90
 *78
 *67
 *88
 *33
 *94
 *100
 *18
 *74
 *82
 *60
 *62
 *83
 *91
 *88
 *55
 *42
 *76
 *91
 *80
 *70
 *40
 *98
 */

	
		
	//Declare a file object
        File inFile = new File("grades.txt");
       
        //Declare Scanner
        Scanner in = new Scanner(inFile);
        
      //Declare variables
        int number = 0;
		int counta = 0;
		int countb = 0;
		int countc = 0;
		int countd = 0;
		int countf = 0;
		
		// Loop to read in data
		 while (in.hasNext())
	        {
	            number = in.nextInt();
	            // Selection Structure/Counters
	            if (number >= 90 && number <= 100)
	            {
	   			 counta++; 
	            }
	            
	            else if (number >= 80 && number <= 89)
	            {
	   			 countb++;
	            }
	            
	            else if (number >= 70 && number <= 79)
	            {
	   			 countc++;
	            }
	            
	            else if (number >= 60 && number <= 69)
	            {
	   			 countd++;
	            }
	            
	            else 
	            {
	   			 countf++;
	            }
	            
	        }
		 
	      // Display output      
		 System.out.println("Number of A's: " + counta);
		 System.out.println("Number of B's: " + countb);
		 System.out.println("Number of C's: " + countc);
		 System.out.println("Number of D's: " + countd);
		 System.out.println("Number of F's: " + countf);
        

		 
		
	}

}
