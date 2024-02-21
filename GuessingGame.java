package homework;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int GuessNumber = (int)(Math.random()*100);
	int guess = 0;
	
	while(GuessNumber != guess) {
		System.out.print("Guess a number between 0 and 100: ");
		guess = input.nextInt();
	if(GuessNumber == guess) {
		System.out.println("Wow you actually did it! ");
		}
	else if(GuessNumber > guess) {
		System.out.println("Gotta bring that number up your number was too low ");
		}
	else
		System.out.println("Woah you got too much dip in your chip the number is too high ");	
	}
}
	
}

