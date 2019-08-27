package lesson.four;
import java.util.Scanner;
//Looping
public class Main {

	public static void main(String[] args) {
		
		// Break and Continue
		int i = 0;
		// While loop
		while (i <= 20) {
			if (i == 3) {
				i += 2; // When using continue, don't forget to change the iterator
				continue; // continue skips a loop iteration, but not the loop
			}
			// Just print odd numbers
			if ((i % 2) == 0) {
				i++;
			}
			if (i > 10) {
				break;
			}
			System.out.println(i);

		}
		// Calculate pi
		double myPi = 4.0;
		double j = 3.0;
		// theory: 4-4/3+4/5-4/7..
		while (j <= 1000) {
			myPi = myPi - (4 / j) + (4 / (j + 2));
			j += 4;

		}
		System.out.println(myPi);
		System.out.println("The value of Pi " + Math.PI);
		
		/*
		 * Execute while loop until the user quits it
		 */
		String contYorN = "Y";
		int h = 1;
		
		Scanner userInput = new Scanner(System.in);
		
		// equalsIgnoreCase checks if the input string is equal to y or Y
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("Continue y or n?");
			contYorN = userInput.nextLine(); // Accepts a string input from the user
			h++;
			
		}
		
		/* 
		 * The do while loop : Used when you want to guarantee the code 
		 * between {} will execute at least once. The code is executed and
		 * then java checks if it should execute again
		 */
		// loop iterator for the do while loop
		// It must be created before the expression is evaluated below
		int k = 1;
		
		do 
		{
			System.out.println(k);
			k++;
		} while (k <= 10); // Counts from 1 to 10
		
		/*
		 * The for loop : Another looping tool in Java
		 * for( declare iterator; conditional statement; change iterator value)
		 */
		
		for (int l=10; l >= 1; l--)
		{
			System.out.println(l);
		}
		
		// System.out.println(l); The variable l is not callable outside of for

		int m, n; // You don't have to declare variables in the for loop
		// You can use multiple variables in the for loop
		for (m=1, n=2; m <= 9; m+=2, n+=2)
		{
			System.out.println(m + "\n" + n);
		}
		
		// You can have for loops inside of for loops, but I'll save 
		// that topic until I talk about arrays
	}

}
