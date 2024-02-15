import java.util.Random;
import java.util.Scanner;

public class CoinFlipChallenge {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Coin Flip Challenge!");
		System.out.println("What is your name?");
		String name = scnr.nextLine();
		System.out.println("Welcome " + name +". Do you want to do The Coin Flip Challenge? Yes or No");
			String choice = scnr.next();
			if (choice.equalsIgnoreCase("Yes")){
				int score = 0;
			for (int i = 0; i < 5; i++) {
				System.out.println("Heads or Tails?");
				String answer = scnr.next();
				Random random = new Random();
		        int number = random.nextInt(2);
	        if (answer.equalsIgnoreCase("Heads") && number == 1) {
	        	System.out.println("Correct");
	        	score++;
	        } else if (answer.equalsIgnoreCase("Heads") && number == 0) {
	        	System.out.println("False");
	        	
	        } else if (answer.equalsIgnoreCase("Tails") && number == 1) {
	        	System.out.println("False");
	        	
	        } else if (answer.equalsIgnoreCase("Tails") && number == 0){
	        	System.out.println("Correct");
	        	score++;
	        } 
		}
			if (score >= 1) {
				System.out.println("You scored " + score + " point " + name);
			} 	}
			else { 
				System.out.println("You're a coward " + name);
			}
		
	}
}
