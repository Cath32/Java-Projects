import java.util.Scanner;
import java.text.*; //needed for DecimalFormat



public class methodquizreview {

	public static void main(String[] args) {
		double myHours = 0.0, myRate = 0.0;
		double myPay = 0.0;
		
		//Invoke the getHours method and store the results in myHours (2 pts)
		myHours = getHours();
		//Call the getRate method and store the results in myRate (2 pts)
		myRate = getRate();
		//Call the weeklyPay method to calculate the user’s pay and store		
		//the results in myPay (2 pts)
		myPay = weeklyPay(myHours, myRate);
		//Call the displayPay method to display the user’s pay (2 pts)
		displayPay(myPay);
		}
	
		//return type: double
		//parameters: none
		//Purpose: This method prompts the user for the number of hours worked in a week
		//The method should validate that number of hours is between 0 and 168 and should return the value.
		public static double getHours() //4 pts
		{
			Scanner in = new Scanner(System.in);
			double hours = 0.0;
			do
			{
				System.out.print("Enter the number of hours worked: ");
				hours = in.nextDouble();
				if(hours < 0 || hours > 168)
				{
					System.out.print("Invalid input! Please enter a number from 1-168.");
				}
			}while(hours < 0 || hours > 168);
			return hours;
		}
	
		//return type: double
		//parameters: none
		//Purpose: This method prompts the user for the hourly pay rate.
		//The method should validate that the hourly pay rate is at least $7.79.
		public static double getRate() //4 pts
		{
			Scanner in = new Scanner(System.in);
			double hourlyRate = 0.0;
			do
			{
				System.out.print("Enter the hourly rate: ");
				hourlyRate = in.nextDouble();
				if(hourlyRate < 7.79)
				{
					System.out.print("Invalid input! Hourly rate must be over $7.79.");
				}
			}while(hourlyRate < 7.79);
			return hourlyRate;
			
		}

	
		//return type: float
		//parameters: 2 doubles(hours and rate)
		//Purpose: This method calculates and returns the weekly pay.
		//Weekly Pay = hours worked x hourly pay rate
		//Overtime (over 40 hours) is paid time and a half
		public static double weeklyPay(double hours, double rate) //5 pts
		{
			double weekPay = 0.0;
			if(hours > 40)
			{
				weekPay = (40 * rate) + ((rate*1.5) * (hours - 40));
			}
			else
				weekPay = hours * rate;
			return weekPay;
		}

		//return type: void
		//parameters: 1 double(weeklypay)
		//Purpose: This method displays the weekly pay
		public static void displayPay(double weeklypay) //4 pts
		{	
			System.out.println("Your pay for the week is $" + weeklypay);
		}

	}
