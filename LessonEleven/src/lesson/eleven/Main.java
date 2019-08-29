package lesson.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Eleven!");
		System.out.println("\n");

		// ArrayList can contain any type of object inside of it.
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();

		ArrayList arrayListTwo = new ArrayList();

		// Only excepts String object inside this ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("Muheimen");
		names.add("Mariana");
		names.add("Tracy");
		names.add("Michael");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("\n");
		// add items to the arrayList
		names.set(0, "John");

		// remove items from the arrayList
		names.remove(3);

		// Enhanced for loop
		for (String i : names) {
			System.out.println(i);
		}

		System.out.println("\n");

		// Iterator object
		Iterator indivItems = names.iterator();

		// Before enhanced for loop Iterator was always used
		while (indivItems.hasNext()) {
			System.out.println(indivItems.next());
		}

		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();

		// Copying all elements from names to nameCopy
		nameCopy.addAll(names);
		String paul = "Paul";
		names.add(paul);

		if (names.contains(paul)) {
			System.out.println("Paul is here");
		}

		System.out.println("\n");

		if (nameCopy.contains(paul)) {
			System.out.println("Paul is here");
		} else {

			System.out.println("Paul isn't here");
		}
		System.out.println("\n");

		// other way
		if (names.containsAll(nameCopy)) {
			System.out.println("Everything is here.");
		}
		System.out.println("\n");
		// Emptying the arraylist
		names.clear();
		if (names.isEmpty()) {
			System.out.println("name arraylist is empty.");
		}

		Object[] objNames = new Object[3];
		objNames = nameCopy.toArray();
		System.out.println("\n");
		System.out.println(Arrays.toString(objNames));
	}
}
