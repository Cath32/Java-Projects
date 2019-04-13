
// Cathrine Bien-Aime
// COP 1210C Classwork 1


import java.util.Scanner;
public class Calories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		
		*Pseudocode: 
	   Display Introduction 
	   Prompt the user for his/her gender.
	   Prompt the user for his/her Activity Level.
	   Prompt the user for his/her weight.
	   Calculate the user's weight and Activity Level depending on their gender.
	   Display the user’s caloric need at the end of the program. 
	   
	*/
			
			
			
			
			
			
			
			
			
			// Declare/initialize variables and constants
			int gender = 0;
			int activitylevel = 0;
			double weight = 0.0;
			double caloriesNeeded = 0.0;
			
		
			
			
			// Created a scanner object for input
			Scanner reader = new Scanner(System.in);
			
			// Introduction
			System.out.print("\n====Welcome to Cathrine's Calorie Calculator==== "
					+ "\n");
			
			// Prompt for gender
			System.out.print("\n***What is your gender?*** "
					+ "\n 1) for Male \t"
					+ "\n 2) for Female \t"
					+ "\n---> Please Enter your gender:  ");
			gender = reader.nextInt();
			
			// // // Prompt for activity level
			System.out.print("\n***What is your activity level?*** "
					+ "\n  1) for Moderately Active  "				
					+ "\n  2) for Low Activity level"				
					+ "\n---> Please Enter Activity Level Here:  ");
			activitylevel = reader.nextInt();
			
			//Prompt for weight
			System.out.print("\n***What is your weight*** ");
			System.out.print("\n---> Please enter your weight (lbs): ");
			weight = reader.nextDouble();
			
			
			
			
			//In case it is FEMALE
			if(gender==2) {
				
				//In case is Moderate
				if(activitylevel == 1) {
					caloriesNeeded = (weight * .12);
				}//In case is Low
				else if (activitylevel == 2) {
					caloriesNeeded = (weight * .10);
					
				} else //Invalid option
				{
					
				}
			}
			
			// In case it is "Male"
			else if (gender==1)  {
				//In case is Moderate
				if(activitylevel == 1) {
					caloriesNeeded = (weight * .15);
				}//In case is Low
				else if (activitylevel == 2) {
					caloriesNeeded = (weight * .13);
					
				} else //Invalid option
				{
					
				}
			}	
				


		System.out.print("\n\tBased on your gender, activity level and weight, your calories needed are : " + caloriesNeeded);
		

	}

}
