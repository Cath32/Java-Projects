/*Bien-Aime, Cathrine
Robinson, Thomas
Hamilton, Leonard

Pseudocode Version1
Display Introduction to game.
Prompt the user for his/her name and greet user
Display the main menu
Prompt the user for the main menu choice.
Regardless of user input: display the rules for the game in a message box. 
Display the 3 sets of questions and prompt user for the answer
Display correct answer for the question
Display game outro

Version 2 Pseudocode
Add two more sets of questions to the game from chapter 3
Declare a accumulator for the point total
For main menu choice:
if (menu==1) - Display rules for the game
else if(menu==2) Start the game
else End the game
For questions:
Determine a point value for each question
if (answer is correct)
	Tell user they are correct and add point(s) to their total
else
	Tell user they are incorrect and they get no point
	
Version 3 Updates
We Added 2 Questions Based on Chapter 4
Added Dialog box for each question showing user score
Added a Do while loop to keep running the program unless user exits by pressing 3
Validated main menu choice and each answer choice
Edited Question 5 for user clarity

Version 4 Updates
Altered program to read questions and answer choices from a file and with a loop to eliminate repetitive programming.
Changed question 5 to a simpler question to read.
Added highscore file to program and selection structure to compare user score to highscore and update the highscore if necessary
*/
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class version4 {
	public static void main(String[] args) throws IOException{
		String question = null, answerA = null, answerB = null, answerC = null, answerD = null, input = null, name = null;
		int answerChoice = 0, menuChoice = 0, correctAnswer = 0, score = 0, points = 0, highscore = 0;
		//Declare a File object
		File inFile = new File ("questions.txt");
		File outFile = new File ("highscore.txt"); // This is to open the highscore file to compare with user score
		//Declare Scanner
		Scanner in = new Scanner(inFile);
		Scanner currentScore = new Scanner(outFile); // This is to read in the current highscore to compare with user score
		// Display an Introduction to the Game.
		JOptionPane.showMessageDialog(null,"\n *!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");  
		//Use an input dialog box to prompt the user for his/her name. 
		name= JOptionPane.showInputDialog("\n What is your name: "); 
		//Use an message dialog box to say hello. 
		JOptionPane.showMessageDialog(null,"\n Hello " + name + "!");
		do {
		   	do
		   	{
			  input = JOptionPane.showInputDialog("\n =====  Main Menu: =====\n >>> Press 1 to See Rules"
	          + "\n >>> Press 2 to  Play Game\n >>> Press 3 to  Exit Game\n"
	          + "\n Please select an option from the main menu: ");
			  menuChoice = Integer.parseInt(input);
			  if (menuChoice < 1 || menuChoice > 3)
			  {
				  JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number from 1-3 for your menu choice.");
			  }
		   	}while(menuChoice < 1 || menuChoice > 3);
		   	if(menuChoice==1)
		    {
		 	   JOptionPane.showMessageDialog(null, "\n =====  Rules for the game: ===== \n You will be asked 3 questions "
		 		          + "\n When answered correctly, you will receive however many points each question is worth. "
		 		          + "\n When answered incorrectly, you will not receive a point.\n"
		 		          + "\n These questions may be true/false, by which you will use 1 for true or 2 for false, or multiple choice, by which you will use the numbers 1-4.\n");
		    }
		   	else if(menuChoice==2)
		    {
		   		for (int i = 1; i <=7; i++)
				{
					//Read from file
					question = in.nextLine();
					answerA = in.nextLine();
					answerB = in.nextLine();
					answerC = in.nextLine();
					answerD = in.nextLine();
					correctAnswer = in.nextInt();
					in.nextLine();
					points = in.nextInt();
					in.nextLine();
					do {
					input = JOptionPane.showInputDialog(null, "Question " + i + "\n" + question + "\n" + "1. " + answerA + "\n" + "2. " + answerB + "\n" + "3. " + answerC + "\n" + "4. " + answerD);
					answerChoice = Integer.parseInt(input);
					if (answerChoice < 1 || answerChoice > 4)
				    {
				    	JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number from 1-4.");
				    }
					}while (answerChoice < 1 || answerChoice > 4);
					if (answerChoice == correctAnswer)
					{
						score+=points;
						JOptionPane.showMessageDialog(null, "You are correct! You have " + score + " total points.");
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer + ". You have " + score + " total points.");
					}
				}
		   		JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING\nYour total score is " + score);
		   		//Selection structure to decide whether the user has the high score
				highscore = currentScore.nextInt();
				if (score > highscore)
				{
					//Declare a PrintWriter object for output
					PrintWriter out = new PrintWriter("highscore.txt"); 
					out.print(score);
					out.close();
				}
		    }
		   	else if (menuChoice ==3)
		 	   System.exit(0);
		}while(menuChoice != 3);
		in.close();
		currentScore.close();
	}
}
