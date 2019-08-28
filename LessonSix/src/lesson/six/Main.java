package lesson.six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//EXCEPTIONS
//java.lang.RunTimeException;
//Arithmatic Exception
//ClassNotFoundException
//IndexOutOfBoundExceptions
//InputMissmatchException
//IOException

public class Main {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		// Arithmatic Exception
//        System.out.println("Hello Lesson Six!");
//        divideByZero(3);

		// InputMissmatchException
//		System.out.println("How old are you? ");
//		int age = checkValidAge();
//		if (age > 0) {
//			System.out.println("Your age is: " + age);
//		}
		try {
			getAFile("./someStuffs.txt");
		}catch(IOException e) {
			System.out.println("IO Error");
		}

	}

	// Arithmatic Exception
	public static void divideByZero(int x) {
		try {
			System.out.println(x / 0);
		} catch (ArithmeticException e) {
			System.out.println("You can't do that calculation");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();

		}
	}

	// InputMissmatchException
	public static int checkValidAge() {
		try {
			return userInput.nextInt();
		} catch (InputMismatchException e) {
			userInput.nextInt();
			System.out.println("This is a fractional number.");
			return 0;
		}
	}
	
	//If you want to catch exception in Main function, you could follow the following method
	public static void getAFile(String fileName) throws IOException, FileNotFoundException{
		
		FileInputStream file = new FileInputStream(fileName);
	}
	
//	public static void getAFile(String fileName) {
//		try {
//			FileInputStream file = new FileInputStream(fileName);
//		}catch(FileNotFoundException e){
//			System.out.println("Sorry, cannot find the file.");
//		}catch(IOException e) {
//			System.out.println("Unknown IO Error");
//		}catch(Exception e) {
//			//catch all exception error, does not tell what the error exactly is.
//			System.out.println("There is an error.");
//		}
//		finally {
//			System.out.println("Executes whether there is an ecxeption or not. ");
//		}
//	}
	
	

}
