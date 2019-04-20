/*Bien-Aime, Cathrine
Robinson, Thomas
Hamilton, Leonard

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

Version 5 Updates
Created methods to break program down into simpler pieces
Added a Chapter 5 question

*/
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
public class javaGameV5 {
	public static void main(String[] args) throws IOException
	{
		String question = null, answerA = null, answerB = null, answerC = null, answerD = null;
		int menuC = 0, correctAnswer = 0, points = 0, score = 0, highscore = 0;
		displayIntro();
		do {
		menuC = displayMainMenu();
		if (menuC == 1)
		{
			displayRules();
		}
		else if (menuC == 2)
		{
			//Declare a File object
			File inFile = new File ("questions.txt");
			//Declare Scanner
			Scanner in = new Scanner(inFile);
			for(int i = 1; i<=8;i++)
			{
				question = in.nextLine();
				answerA = in.nextLine();
				answerB = in.nextLine();
				answerC = in.nextLine();
				answerD = in.nextLine();
				correctAnswer = in.nextInt();
				in.nextLine();
				points = in.nextInt();
				in.nextLine();
				score+=processQuestion(question, answerA, answerB, answerC, answerD, points, correctAnswer);
				displayScore(score);
			}
			in.close();
			highscore = readInHighScore();
			compareScore(highscore, score);
			JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING!!!");
		}
		else if (menuC == 3)
		{
			System.exit(0);
		}
		}while(menuC!=3);
	}	
	//Return type: void
	//Parameters: None
	//Purpose: Display intro and prompt user for name and greet them by name
	public static void displayIntro()
	{
		String name = null;
		// Display an Introduction to the Game.
		JOptionPane.showMessageDialog(null,"\n *!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");  
		//Use an input dialog box to prompt the user for his/her name. 
		name= JOptionPane.showInputDialog("\n What is your name: "); 
		//Use an message dialog box to say hello. 
		JOptionPane.showMessageDialog(null,"\n Hello " + name + "!");
	}
	//Return type: int
	//Parameters: None
	//Purpose: To display main menu and prompt user for their choice and validate. Method returns menu choice
	public static int displayMainMenu()
	{
		String input = null;
		int menuChoice = 0;
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
		return menuChoice;
	}
	//Return type: void
	//Parameters: None
	//Purpose: To display the rules of the game
	public static void displayRules()
	{
		JOptionPane.showMessageDialog(null, "\n =====  Rules for the game: ===== \n You will be asked 3 questions "
		          + "\n When answered correctly, you will receive however many points each question is worth. "
		          + "\n When answered incorrectly, you will not receive a point.\n"
		          + "\n These questions may be true/false, by which you will use 1 for true or 2 for false, or multiple choice, by which you will use the numbers 1-4.\n");
	}
	//Return type: int
	//Parameters: 5 Strings and 2 ints
	//Purpose: To display the question and prompt for answer choice and validate. Returns the points the user earned depending on if they were correct or incorrect
	public static int processQuestion(String q1, String ansA, String ansB, String ansC, String ansD, int pointValue, int correctAns) throws IOException
	 {
		int answerChoice = 0;
		String input = null;
		do 
		{
			input = JOptionPane.showInputDialog(null, q1 + "\n" + "1. " + ansA + "\n" + "2. " + ansB + "\n" + "3. " + ansC + "\n" + "4. " + ansD);
			answerChoice = Integer.parseInt(input);
			if (answerChoice < 1 || answerChoice > 4)
		    {
		    	JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number from 1-4.");
		    }
		}while (answerChoice < 1 || answerChoice > 4);
		if (answerChoice == correctAns)
		{
			JOptionPane.showMessageDialog(null, "You are correct!");
			return pointValue;
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
			return 0;
		}
	 }
	//Return type: int
	//Parameters: None
	//Purpose: To read in the highscore from text file and return that value
	public static int readInHighScore() throws IOException 
	{
		int highscore = 0;
		File outFile = new File ("highscore.txt"); // This is to open the highscore file to compare with user score
		Scanner currentScore = new Scanner(outFile); // This is to read in the current highscore to compare with user score
		highscore = currentScore.nextInt();
		currentScore.close();
		return highscore;
	}
	//Return type: void
	//Parameters: 2 ints
	//Purpose: To compare the user score to highscore and update the highscore file if user attained high score
	public static void compareScore(int highScore, int userScore) throws IOException
	{
		if (userScore > highScore)
		{
			//Declare a PrintWriter object for output
			PrintWriter out = new PrintWriter("highscore.txt"); 
			out.print(userScore);
			out.close();
		}
	}
	//Return type: void
	//Parameters: 1 int
	//Purpose: To display the user's score
	public static void displayScore(int score)
	{
		JOptionPane.showMessageDialog(null, "Your total score is: " + score);
	}
}
