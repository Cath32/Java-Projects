/*
 * Thomas Robinson
 * Cathrine Bien-Aime
 * Leonard Hamilton'
 * 
 * Random number guessing
 * This program will generate a random number from 1-100 and prompt the user to guess the number, it will count the amount of guesses
 * the user takes and that will determine how good the user did. It will also tell the user whether their guess is too high or too low 
 * 
PSEUDOCODE
//Save variables
//int ans1=0, menuC=0, guess1=0, rnum1=0;
//display  introduction menu
do
{
//display menu
1) See rules.
2) Play game.
3) Exit.
//Prompt menu choice.
if(menuC==1)
Show rules
else if(menuC==2)
{

//Input random number generator
do
{
do
{
//Prompt for awnser
if(ans1>100 || ans1<1)
Dispay invalid.
}
while(ans1>100 || ans1<1);

//if(ans1>rnum1);
System.out.println("Your number is too high try again.");
guess1++;
//else if (ans1<rnum1);
System.outprintln("Your number is too low try again.");
guess1++;
//else
System.out.println("You are correct")
guess1++;
}
while(ans1!=rnum1);
if(guess1>6)
System.outprintln("You Got It");
else if(guess1>=4)
System.out.println("You Did Good");
else
System.out.println("You did a great job");
}



else if(menuC==3)
Exit

else
print invalid 
}

while(menuC!=3);

 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Classwork2 {
	public static void main(String[] args) {
		//Delcare and initialize variables and random number
		int ans1=0, menuC=0, guess1=0, rnum1=0;
		String input;
		Random rand = new Random(); 
		//Display  introduction menu
		JOptionPane.showMessageDialog(null,"WELCOME TO THE RANDOM NUMBER GENERATOR!!!");
		do
		{
			//diplay menu
			input = JOptionPane.showInputDialog("Main Menu\n1)See rules\n2)Play game\n3)Exit");
			menuC= Integer.parseInt(input);
			//Prompt menu choice.
			if(menuC==1)
			{
				//Show rules
				JOptionPane.showMessageDialog(null, "I will choose a random number from 1-100 and the player will try to guess the number in the least"
						+ "amount of guesses.");
			}
			else if(menuC==2)
			{
				//Input random number generator
				rnum1=rand.nextInt(101)+1;
				JOptionPane.showMessageDialog(null,"Random number = " + rnum1);
				do
				{
					do
					{
						//Prompt for answer
						input = JOptionPane.showInputDialog("Enter a number from 1-100");
						ans1= Integer.parseInt(input);
						if(ans1>100 || ans1<1)//Dispay invalid
							JOptionPane.showMessageDialog(null, "Invalid answer!");
					}while(ans1>100 || ans1<1);
					if(ans1>rnum1)
					{
						JOptionPane.showMessageDialog(null,"Your number is too high try again.");
						guess1++;
					}
					else if (ans1<rnum1)
					{
						JOptionPane.showMessageDialog(null,"Your number is too low try again.");
						guess1++;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"You got it.");
						guess1++;
					}
				}while(ans1!=rnum1);
				if(guess1>6)
					JOptionPane.showMessageDialog(null, "You are correct. It took you a while but you got there!");
				else if(guess1>=4)
					JOptionPane.showMessageDialog(null, "You a correct. You Did Good!");
				else
					JOptionPane.showMessageDialog(null, "You are correct. You did a great job!");
			}
			else if(menuC==3)
				System.exit(0);
			else
				JOptionPane.showMessageDialog(null, "Invalid choice.");
		}while(menuC!=3);
	}
}
