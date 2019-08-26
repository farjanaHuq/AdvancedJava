package lesson.two;
import java.util.Scanner;

public class Main {
	
	private static final int numEnteredTimes2 = 0;
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Your favourite number: ");
		if(userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			int numEnteredTimes2 = numberEntered + numberEntered;
			
			System.out.println(numberEntered + " " +numberEntered + "=" + numEnteredTimes2);
		}
		else {
			System.out.println("You should enter a number.");
		}

	}

}
