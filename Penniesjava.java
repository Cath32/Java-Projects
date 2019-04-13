// Cathrine Bien-Aime
// COP 1210C Homework 3

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Penniesjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  numdaysworked = 0;
		double total = 0.01;
		double salary = 0.0;
		
		
		  // Created a scanner object for input
        Scanner reader = new Scanner(System.in);
        NumberFormat AmericanMoney = NumberFormat.getCurrencyInstance(Locale.US); //Converts final salary into US dollars
        
        System.out.print("\nPlease enter the number of days worked: ");
        numdaysworked = reader.nextInt();
        
        /*
         * Write a program that calculates how much a person 
         * would earn over a period of time if his or her salary 
         * is one penny the first day, two pennies the second day, 
         * and continues to double each day.    
         * 
         * • The program should ask the user for the number of days.   
         * • Display a table showing how much the salary was for each day, 
         * and then show the total pay at the end of the period.    
         * • The output should display the dollar amount, not the 
         * number of pennies.    
         * Input validation: Do not accept a number less than one for 
         * the number of days worked.   
         */
        
        while (numdaysworked < 1)
        	
        {System.out.println("Invalid input: " + numdaysworked + ", please try again!");
        
        System.out.print("\nPlease enter the number of days worked: ");
        numdaysworked = reader.nextInt();
            }

        
        System.out.print("\nDay\tSalary ");
        System.out.println("\n----------------");
        
        for (int day = 1; day <= numdaysworked; day++) {
        	System.out.print(day);
        	salary += total;
        	System.out.println("\t" + total);
        	total *= 2; 
        	
        }

        System.out.print("\nTotal \t" + AmericanMoney.format (salary) );
        
        
	}

}
