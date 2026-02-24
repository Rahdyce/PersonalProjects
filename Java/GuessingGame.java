package homework;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int GuessNumber = (int)(Math.random()*100);
	int guess = 0;
	int guessCounter = 0;
	
	while(GuessNumber != guess) {
		System.out.print("Guess a number between 0 and 100: ");
		guess = input.nextInt();
	if(GuessNumber == guess) {
		System.out.println("Wow you actually did it! ");
		System.out.println("You guessed it in" + guessCounter + " tries");
		}
	else if(GuessNumber > guess) {
		System.out.println("Gotta bring that number up your number was too low ");
		guessCounter++;	
	}
	else
		System.out.println("Slow down there that number is too high ");	
	guessCounter++;
	}
}
	
}
