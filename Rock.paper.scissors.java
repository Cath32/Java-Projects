// Cathrine Bien-Aime

import java.util.Scanner;

public class javaprogramming {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	// rock, paper, scissors.
		rockPaperScissorsGame();
		}
	public static void rockPaperScissorsGame() {
		System.out.print("\n*How many games would you like to play?*  ");
		int gamesCompleted = 0;
		int gamesRequested = s.nextInt();
		s.nextLine();
		while(gamesCompleted < gamesRequested){
			String userChoice = promptUserChoice();
			String computerChoice = promptComputerChoice();
			printResults(userChoice, computerChoice);
			if(userChoice.equals(computerChoice)){
				gamesCompleted++;
			}
	}
		System.out.print("\nThanks for playing Rock, ,paper, Scissors");
	}
	public static void printResults(String userChoice,  String computerChoice){
		System.out.print("\nYou chose:   " + userChoice);
		System.out.print("\nComputer chose:  " + computerChoice);
		
		if(userChoice.equals("Rock")){
			if(computerChoice.equals("Rock")){	
				System.out.print("\nYou tied !!!");
			}else if(computerChoice.equals("Paper")){
				System.out.print("\nYou lost!!!");
			}if(computerChoice.equals("Scissors")){	
				System.out.print("\nyou won !!!");
			}
		} else if(userChoice.equals("Paper")){
			if(computerChoice.equals("Rock")){	
				System.out.print("\nyou won !!!");
			}else if(computerChoice.equals("Paper")){
				System.out.print("\nYou tied !!!");
			}if(computerChoice.equals("Scissors")){	
				System.out.print("\nYou lost!!!");
			}
		}else if(userChoice.equals("Scissors")){
			if(computerChoice.equals("Rock")){	
				System.out.print("\nYou lost!!!");
			}else if(computerChoice.equals("Paper")){
				System.out.print("\nyou won !!!");
			}if(computerChoice.equals("Scissors")){	
				System.out.print("\nYou tied !!!");
			}
		}
		System.out.print("\n********************");
			
			
		
		
	}
	public static String promptComputerChoice(){
		int computerChoiceNum = (int)(3*Math.random());
		if(computerChoiceNum == 0){
			return "Rock";
		}else if (computerChoiceNum == 1){
			return "Paper";
		}else{
			return "Scissors";
		}
	}
	
	public static String promptUserChoice(){
		System.out.print("\nChoose: 1-Rock 2-Paper 3-Scissors: ");
		int computerChoiceNum = s.nextInt();
		if(computerChoiceNum == 1 ) {
			return "Rock";
		}else if(computerChoiceNum == 2){
			return "Paper";
		}else {
			return "Scissors";
		}
	}
		
	}
	




	
