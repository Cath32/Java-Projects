//Cathrine Bien-Aime


package lunch.java;
import java.util.Scanner;

public class Lunchjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Write a program that prompts the user for a lunch order at a sub shop and calculates the total cost of the order.  
		The order should include the type of sandwich that is ordered, the cost of the sandwich, the cost of the chips on the side, 
		and the cost of the drink. The total cost of the order, including 7% sales tax, 
		should then be calculated and displayed on the console */
		
		String type_of_sandwich;
		double cost_of_sandwich;
		double cost_of_chips;
		double cost_of_drink;
		double cost_of_meal;
		double tax_of_meal;
		double total_of_meal;
		
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("\n******************************"); 
		System.out.println("WELCOME TO Cathrine's BISTRO!!");
		System.out.println("******************************\n"); 
		
		// type of sandwich that is ordered
		System.out.print("1. Please enter the type of sandwich ordered: ");
		type_of_sandwich = reader.next();
			
		// the cost of the sandwich
		System.out.print("2. Please enter the cost of the sandwich:  ");
		cost_of_sandwich = reader.nextDouble();
		
		//the cost of the chips on the side
		System.out.print("3. Please enter the cost of the chips:  "); 
		cost_of_chips = reader.nextDouble();
		
		// the cost of the drink
		System.out.print("4. Please enter the cost of the drink:  ");
		cost_of_drink = reader.nextDouble();
		
		System.out.println("\n*******************************************\n");
		
		// calculated and displayed on the console
		String line = "";
		cost_of_meal = (cost_of_sandwich + cost_of_chips + cost_of_drink );
		line = String.format("Cost of Meal $%.2f", cost_of_meal);
		System.out.println(line);
		
		
		// including 7% sales tax
		tax_of_meal = (cost_of_meal * 0.07);
		line = String.format("Tax:  $%.2f", tax_of_meal);
		System.out.println(line);
		
		// The total cost of the order
		total_of_meal = (cost_of_meal * 0.07 + cost_of_sandwich + cost_of_chips + cost_of_drink);
		line = String.format("Total:  $%.2f", total_of_meal);
		System.out.println(line);
		
		

		
		
		
	}

}
