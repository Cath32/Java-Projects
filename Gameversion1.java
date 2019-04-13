// Bien-Aime, Cathrine
// Robinson, Thomas
// Hamilton, Leonard



import java.util.Scanner;
import javax.swing.JOptionPane;
public class JavaGamev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  
		 ******pseudocode******
			
			1. Display Introduction to game.
			
			2. Prompt the user for his/her name.
			Display the following main menu: 
			1) See Rules 
			2) Play Game 
			3) Exit 
			 
			3. Prompt the user for the main menu choice.
			
			5. Regardless of user input: 
			   Display the rules for the game in a message box. 
			
			6.Prompt the user for each menu choice.
			
			6.Display the 3 sets of questions and answers.
			
			7. Include documentation (comments) in your code.
			
			8. Player must get 15 point to win game. 
		 
		  
		  */
		
		
		// Declare/initialize variables and constants
		 String name;
		 String menu;
		 String answer;
		 int score = 0;
		 
		
		
		// Created a scanner object for input
        Scanner reader = new Scanner(System.in);
       
         
        
        System.out.println("\n******************************************************* ");
        // Display an Introduction to the Game.
        System.out.println("\n*!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");
        
        System.out.println("\n******************************************************* ");
        
        JOptionPane.showMessageDialog(null,"\n *!!!!!!! Who Wants to Be a Java Programmer? !!!!!!!* ");
        
        //Use an input dialog box to prompt the user for his/her name. 
        name= JOptionPane.showInputDialog("\n What is Your name: ");
        
       //Use an message dialog box to say hello. 
        JOptionPane.showMessageDialog(null,"\n *hello* " + name);       
        
        
        //Display the following main menu: 1) See Rules 2) Play Game 3) Exit
        menu = JOptionPane.showInputDialog("\n =====  Main Menu: ===== "
        		+ "\n >>> Press 1 to  See Rules"
        		+ "\n >>> Press 2 to  Play Game"
        		+ "\n >>> Press 3 to  Exit Game " 
        		+"\n"
        		// Regardless of user input: 
        		// Display the rules for the game in a message box. 
        		+"\n =====  Rules for the game: ===== \n *You will be asked (3) question* "
        		+ "\n <> should you answer correctly, you will receive ~ 5 ~ points. "
        		+ "\n <> If you answer incorrectly, you will receive ~ 0 ~ points. "
        		+ "\n Get 15 points to WIN the game "
        		+"\n"
        		// Prompt the user for each menu choice.
        		+ "\n What is your menu option: ");
        
        if (menu.contentEquals("1")) {
        	//Display the rules for the game in a message box. 
            JOptionPane.showMessageDialog(null,"\n =====  Rules for the game: ===== \n *You will be asked (3) question* "
            		+ "\n <> should you answer correctly, you will receive ~ 5 ~ points. "
            		+ "\n <> If you answer incorrectly, you will receive ~ 0 ~ points. "
            		+ "\n Get 15 points to WIN the game ");
            
            
        } else if (menu.contentEquals("2")) {
        //  These questions should come from the topics in Chapters 1 – 2.
            // Question # 1
        	answer = JOptionPane.showInputDialog("\n =====  Question # 1: ===== \n <>True or False<>: "
        			+ "\n* Boolean refers to a system of logical "
            		+ "thought that is used to create true/false statements. ");
        	if (answer.contentEquals ("true")) {
        		JOptionPane.showMessageDialog(null, "~ 5 ~ POINTS");
        		score = score + 5;
        	}
        	else { 
        		JOptionPane.showMessageDialog(null, "~ 0 ~ POINTS");
        	}
        	// Display answers
        	JOptionPane.showMessageDialog(null, "The answer to Question # 1 is: TRUE");
        	
        	//Question # 2
        	answer = JOptionPane.showInputDialog("\n =====  Question # 2: ===== \n <>True or False<>: "
            		+ "\n* Before a variable is used it must be declared. ");
        	if (answer.contentEquals ("true")) {
        		JOptionPane.showMessageDialog(null, "~ 5 ~ POINTS");
        		score = score + 5;
        	}
        	else { 
        		JOptionPane.showMessageDialog(null, "~ 0 ~ POINTS");
        	}
        	// Display answers
        	JOptionPane.showMessageDialog(null, "The answer to Question # 2 is: TRUE");
        	
        	
        	//Question # 3
        	answer = JOptionPane.showInputDialog("\n =====  Question # 3: ===== \n <>True or False<>: \n* Pertaing to a decimal #, "
            		+ "you must use int Data type, not double Data type. ");
        	if (answer.contentEquals ("false")) {
        		JOptionPane.showMessageDialog(null, "~ 5 ~ POINTS");
        		score = score + 5;
        	}
        	else { 
        		JOptionPane.showMessageDialog(null, "~ 0 ~ POINTS");
        	}
        	// Display answers
        	JOptionPane.showMessageDialog(null, "The answer to Question # 3 is: FALSE");
        	
            
        	
            
	        } else if (menu.contentEquals("3")) {
	        	//Display the rules for the game in a message box. 
	            JOptionPane.showMessageDialog(null,"\n  Bye!. ");
	        } else {
	        	
	        }
        
        
        JOptionPane.showMessageDialog(null, "Congrats your score is: " + score );
        JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING");
        
	

	}

}
