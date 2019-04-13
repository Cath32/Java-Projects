/*Bien-Aime, Cathrine
Robinson, Thomas
Hamilton, Leonard
COP1210C Lab 1
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
*/
import javax.swing.JOptionPane;
public class version2 {
 public static void main(String[] args) {
   // Declare/initialize variables and constants
   String name;
   String input;
   String answer;
   int menuChoice = 0, score = 0;
   // Display an Introduction to the Game.
   JOptionPane.showMessageDialog(null,"\n *!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");  
   //Use an input dialog box to prompt the user for his/her name. 
   name= JOptionPane.showInputDialog("\n What is your name: "); 
   //Use an message dialog box to say hello. 
   JOptionPane.showMessageDialog(null,"\n Hello " + name + "!");       
   //Display the following main menu and prompt the user for each menu choice.
   input = JOptionPane.showInputDialog("\n =====  Main Menu: =====\n >>> Press 1 to See Rules"
          + "\n >>> Press 2 to  Play Game\n >>> Press 3 to  Exit Game\n"
          + "\n Please select an option from the main menu: ");
   menuChoice = Integer.parseInt(input);
   if(menuChoice==1)
   {
	   JOptionPane.showMessageDialog(null, "\n =====  Rules for the game: ===== \n You will be asked 3 questions "
		          + "\n When answered correctly, you will receive a point. "
		          + "\n When answered incorrectly, you will not receive a point.\n"
		          + "\n These questions may be true/false, by which you will use T or F, or multiple choice, by which you will use the letters A-D.\n");
   }
   else if(menuChoice==2)
   {
	    //Question # 1
       answer = JOptionPane.showInputDialog("\n =====  Question # 1: ===== \n <>True or False<>: "
         + "\nBoolean refers to a system of logical thought that is used to create true/false statements. ");
       if(answer.equals("t") || answer.equals("T"))
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is True!");
    	   score++; 
       }
       else
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is True!");
       //Question # 2
       answer = JOptionPane.showInputDialog("\n =====  Question # 2: ===== \n <>True or False<>: "
            + "\nBefore a variable is used it must be declared. ");
       if(answer.equals("t") || answer.equals("T"))
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is True!");
    	   score++; 
       }
       else
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is True!");
       //Question # 3
       answer = JOptionPane.showInputDialog("\n =====  Question # 3: ===== \n <>True or False<>: "
       		+ "\nFor 1.8, you must use int Data type, not double Data type. ");        
       if(answer.equals("f") || answer.equals("F"))
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is False!");
    	   score+=2; 
       }
       else
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is False!");
       //Question # 4
       answer = JOptionPane.showInputDialog("\n =====  Question # 4: ===== \n <>Multiple Choice<>: "
      		 +"What is the proper way to write the logical operator AND in Java?\nA. **\nB. ||\nC. AND\nD. &&");
       if(answer.equals("d") || answer.equals("D"))
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is D. &&");
    	   score++; 
       }
       else
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is D. &&");
       //Question # 5
       answer = JOptionPane.showInputDialog(" =====  Question # 5: ===== \n <>Multiple Choice<>: \""
       		+ "Which would be the correct output for the following statement:\n"
      		 +"int a=3, b=7, c=4, d=5;\nif(a>b || b<d || d>c)\n\tSystem.out.print(b-d);\nelse\n\tSystem.out.print(b);"
      		 +"\nA. 2\nB. 5\nC. 7\nD. 0");
       if(answer.equals("a") || answer.equals("A"))
       {
    	   JOptionPane.showMessageDialog(null,"You are correct! The answer is A. 2");
    	   score+=3; 
       }
       else
    	   JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is A. 2");
      JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING\nYour total score is " + score);
   }
   else 
	   System.exit(0);
 }
}