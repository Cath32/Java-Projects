
/*
 * PSEUDOCODE
 * Declare Variables
 * Display Intro
 * Declare File object
 * Declare Scanner
 * Declare the number format
 * Use a while loop to read in values from text file while adding to accumulator and counter
 * Calculate the average and minimum and maximum values
 * Display the total, average, counter and max and minimum values
 *
 * The Numbers: 	
 *53
 *42
 *80
 *45
 *43
 *57
 */
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class numberReader {

	public static void main(String[] args) throws IOException{
		//Declare variables
		int count = 0;
		double average = 0.0, number = 0.0, total = 0.0, maxValue = 0.0, minValue = 0.0;
		//Display intro
		System.out.println("Welcome to the Number Reader!");
		//Declare a file object
		File inFile = new File("numbers.txt");
		//Declare Scanner
		Scanner in = new Scanner(inFile);
		//Number format
		DecimalFormat averageFormat = new DecimalFormat("###.0");
		DecimalFormat totalFormat  = new DecimalFormat("###");
		//Use a while loop to read in values
		while (in.hasNext())
		{
			number = in.nextInt();
			//Accumulator
			total+=number;
			//Counter
			count++;
			//Calculate the maximum and minimum value read in
			maxValue = Math.max(maxValue, number);
			if (count ==1)
			{
				minValue = number;
			}
			else
			{
				if (number < minValue)
				{
					minValue = number;
				}
			}
		}
		//Calculate average
		average = total/count;
		//Display Results
		System.out.println("\nNumber of values read in:\t" + count);
		System.out.println("\nTotal of values read in:\t" + totalFormat.format(total));
		System.out.println("\nAverage of values read in:\t" + averageFormat.format(average));
		System.out.println("\nHighest value read in:\t" + totalFormat.format(maxValue));
		System.out.println("\nLowest value read in:\t" + totalFormat.format(minValue));
		//Close the file
		in.close();
		
	}

}