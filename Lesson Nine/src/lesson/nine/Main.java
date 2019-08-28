package lesson.nine;

import java.util.Arrays;

//Arrays

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Nine!");

		int[] numArray = new int[10];

		// Adds value to the array
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i;
		}
		// Prints a line of 41 dashes here
		int k = 1;
		while (k <= 41) {
			System.out.print('-');
			k++;
		}
		System.out.println();

		for (int j = 0; j < numArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");

		String[][] multiArray = new String[10][10];

		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}

		k = 1;
		while (k <= 61) {
			System.out.print('-');
			k++;
		}
		System.out.println();

		// Prints the multidimensional array
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println("|");
		}

		k = 1;
		while (k <= 61) {
			System.out.print('-');
			k++;
		}
		System.out.println();

		// Enhanced array
		for (int row : numArray) {
			System.out.print(row);
		}
		System.out.println("\n");

		// Enhanced Multidimensional Array
//		for(String[] rows : multiArray) {
//			for(String[] columns : multiArray) {
//				System.out.print("| " + columns + " ");
//			}
//			System.out.println("|");
//		}

		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2);

		// Fills a multidimensional array

		char[][] boardGame = new char[10][10];
		for (char[] row : boardGame) {
			Arrays.fill(row, '*');
		}

		// Sorts an array using sort()
		int[] numsToSort = new int[10];
		for (int i = 0; i < 10; i++) {
			numsToSort[i] = (int) (Math.random() * 100);
		}

		// Sort the array in ascending order

		Arrays.sort(numsToSort);
		System.out.println(Arrays.toString(numsToSort));

		// binarySearch returns the index for the searched for value
		int whereIs50 = Arrays.binarySearch(numsToSort, 50);
		System.out.println(whereIs50);

	}

}
