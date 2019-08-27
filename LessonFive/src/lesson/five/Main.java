package lesson.five;
import java.util.Scanner;

//Method

public class Main {
	
	static double myPI = 3.14159; //Class variable - accessible to other classes
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		
		/*
		 * Basic Method { Statements }
		 * 
		 * Access Modifier: Determines who can execute a method
		 * 
		 * static: Used when you want to be able to execute a method that isn't part of
		 * a class definition
		 * 
		 * Return Data Type: The data type of value returned after a method executes
		 * (void if no values are returned)
		 * 
		 * Method Name: Must start with a letter, but can include letters, numbers, $,
		 * or _
		 * 
		 * Parameters / Arguments: Values passed to a method
		 * 
		 */
		System.out.println(addThem(1,2));
		int d = 5;
		tryToChange(d);
		System.out.println("Main d " + d);
		
		System.out.println("The random number is: " + getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		while(guessResult != -1) {
			System.out.println("Guess a number between 0 and 50");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}


	}
	//Add two integers
	public static int addThem(int a, int b) {
		
		int c = a+b;
		return c;
				
	}
	//Change integer input
	public static void tryToChange(int d) {
		d+=1;
		//System.out.println("Try to change" + d);
		
	}
	//Random Number
	public static int getRandomNum() {
		randomNumber = (int)(Math.random()*51);
		return randomNumber;
	}
	public static int checkGuess(int randomGuess) {
		
		if(randomGuess <getRandomNum()|randomGuess >getRandomNum() ) {
			System.out.println("Please try again");
		}else {
			System.out.println("Yes, the random number is: " + randomGuess);
			
		}
		return randomGuess;
	}

}
