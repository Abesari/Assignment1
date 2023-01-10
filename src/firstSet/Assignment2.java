package firstSet;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		int attempts= 0;
		Random rando = new Random();
		int target = rando.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		
		
		
		while(attempts < 5) {
			System.out.print("What is your guess from 1 to 100?" );
			int guessNum = scan.nextInt();
			
		if(guessNum >= target - 10 && guessNum <=target + 10) {
			System.out.print("you're correct!");
			break;
		} else {System.out.print("Incorrect!");
			
		}
		
		attempts++;
	}
		
	if(attempts == 5) {
		System.out.println("You lose! The answer was" + target);
	}
	
	scan.close();
}
}
