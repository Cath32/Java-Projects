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

*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class version3 {
	public static void main(String[] args) {
/// Declare/initialize variables and constants
   String name;
   String input;
   String answer;
   int menuChoice = 0, score = 0, answerChoice = 0;
   // Created a scanner object for input
   Scanner reader = new Scanner(System.in);
   // Display an Introduction to the Game.
   JOptionPane.showMessageDialog(null,"\n *!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");  
   //Use an input dialog box to prompt the user for his/her name. 
   name= JOptionPane.showInputDialog("\n What is your name: "); 
   //Use an message dialog box to say hello. 
   JOptionPane.showMessageDialog(null,"\n Hello " + name + "!");       
   //Display the following main menu and prompt the user for each menu choice.
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
		          + "\n When answered correctly, you will receive a point. "
		          + "\n When answered incorrectly, you will not receive a point.\n"
		          + "\n These questions may be true/false, by which you will use 1 for true or 2 for false, or multiple choice, by which you will use the numbers 1-4.\n");
   }
   else if(menuChoice==2)
   {
	    //Question # 1
	   do {
       input = JOptionPane.showInputDialog("\n =====  Question # 1: ===== \n <>True or False<>: "
         + "\nBoolean refers to a system of logical thought that is used to create true/false statements. ");
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 2)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 or 2.");
       }
	   }while(answerChoice < 1 || answerChoice > 2);
       if(answerChoice==1)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is True!");
    	   score++; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is True!");
       }
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
       //Question # 2
       do {
       input = JOptionPane.showInputDialog("\n =====  Question # 2: ===== \n <>True or False<>: "
            + "\nBefore a variable is used it must be declared. ");
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 2)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 or 2.");
       }
       }while (answerChoice < 1 || answerChoice > 2);
       if(answerChoice==1)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is True!");
    	   score++;
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is True!");
       }
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
       //Question # 3
       do {
       input = JOptionPane.showInputDialog("\n =====  Question # 3: ===== \n <>True or False<>: "
       		+ "\nFor 1.8, you must use int Data type, not double Data type. ");        
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 2)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 or 2.");
       }
       }while (answerChoice < 1 || answerChoice > 2);
       if(answerChoice==2)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is False!");
    	   score+=2; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is False!");
       }
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
       //Question # 4
       do {
       input = JOptionPane.showInputDialog("\n =====  Question # 4: ===== \n <>Multiple Choice<>: "
      		 +"What is the proper way to write the logical operator AND in Java?\n1. **\n2. ||\n3. AND\n4. &&");
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 4)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number 1-4.");
       }
       }while (answerChoice < 1 || answerChoice > 4);
       if(answerChoice==4)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is 4. &&");
    	   score++; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is 4. &&");
       }
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
       //Question # 5
       do {
       input = JOptionPane.showInputDialog(" =====  Question # 5: ===== \n <>Multiple Choice<>: \""
       		+ "Which would be the correct output for the following statement:\n"
      		 +"int a=3, b=7, c=4, d=5;\nif(a>b || b<d || d>c)\n\tSystem.out.print(b-d);\nelse\n\tSystem.out.print(b);"
      		 +"\n1. 2\n2. 5\n3. 7\n4. 0");
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 4)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number 1-4.");
       }
       }while (answerChoice < 1 || answerChoice > 4);
       if(answerChoice==1)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is 1. 2");
    	   score+=3; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is 1. 2");
       }
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
         // Question #6
         do {
         input = JOptionPane.showInputDialog("\n =====  Question # 6: ===== \n <>True or False<>: "
         + "\nInfinite loops are loops that do not end. ");
         answerChoice = Integer.parseInt(input);
         if (answerChoice < 1 || answerChoice > 2)
         {
      	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 or 2.");
         }
         }while (answerChoice < 1 || answerChoice > 2);
       if(answerChoice==1)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is True!");
    	   score+=2; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is True!");
       }   	   
       JOptionPane.showMessageDialog(null,"Keep going your total score is "+ score);
       //Question 7
       do {
       input = JOptionPane.showInputDialog("\n =====  Question # 7: ===== \n <>True or False<>: "
       + "\n A while loops executes 1 or more times. ");
       answerChoice = Integer.parseInt(input);
       if (answerChoice < 1 || answerChoice > 2)
       {
    	   JOptionPane.showMessageDialog(null, "Invalid input! Please enter 1 or 2.");
       }
       }while (answerChoice < 1 || answerChoice > 2);
       if(answerChoice==2)
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is False!");
    	   score+=3; 
       }
       else
       {
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is False!");
       }
       JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING\nYour total score is " + score);
   }
   else if (menuChoice ==3)
	   System.exit(0);
   }while(menuChoice != 3);
  }
}