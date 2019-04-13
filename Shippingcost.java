// Cathrine Bien-Aime
// COP1210C Homework 2 (Shipping Cost)

import java.util.Scanner;

public class algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Include an algorithm (Pseudocode) as comments at the top of the program.
		
		/* ******pseudocode******

			weight = 0
			flateRate = 2.00
			cost = 0
			
			
			Package weight: ----- Rate per lb:
			Less than 3 lbs -----   .50 
			Less than 6 lbs -----   1.25 
			Less than 9 lbs -----   2.75 
			9 lbs or more   -----   3.50 
			
			weight = 0
			flateRate = 2.00
			cost = 0
			
			1. Display Welcome Introduction.
			2. Prompt for the weight of the package in (lbs). 
			3. Customer will input the weight of the package.
			4. Calculate the flat rate of $2 per package plus the Package weight per lbs.
			5. Display the total cost to ship the package is:
			
			*/
					
		
		/* This program prompts the user for the weight of a package.  
		 * Then uses a decision structure to determine the total cost to ship a package.  
		 * Then displays the total cost on the screen. */
		

		
		// Declare/initialize variables and constants
		int weight = 0; // weight of package
		double flateRate = 2.00; // flat rate price (constant)
		double cost = 0 ; // Shipping cost calculation
		
		
		
		// Created a scanner object for input
		Scanner reader = new Scanner(System.in);
		
		// Introduction display
		System.out.println("\n*///////WELCOME TO THE SHIPPING PROGRAM////////* ");
		
		 // Prompt for weight
		System.out.print("\n= Please enter the weight of the package (lbs): ");
		weight = reader.nextInt();
		
		System.out.println("\n*////////////////////////////////////////////* ");
		
		// Display the cost of package
		if(weight < 3) { 
			cost = (weight * .50) ; // Shipping cost calculation
			// display results
			System.out.println("\n= The total cost to ship your package is: $" + (cost + flateRate ));
		}
		else if (weight < 6) {
			cost = (weight * 1.25) ; // Shipping cost calculation
			//display results
			System.out.println("\n= The total cost to ship your package is: $" + (cost + flateRate ));
		}
		else if (weight < 9) {
			cost = (weight * 2.75) ; // Shipping cost calculation
			//display results
			System.out.println("\n= The total cost to ship your package is: $" + (cost + flateRate ));
		}
		else {
			cost = (weight * 3.50) ; // Shipping cost calculation
			//display results
			System.out.println("\n= The total cost to ship your package is: $" + (flateRate + cost ));
		}
			
		
		System.out.println("\n*//////THANKS FOR SHOPPING/////////* ");
		
		
	}

}
