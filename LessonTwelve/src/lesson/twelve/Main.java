package lesson.twelve;
import java.util.Arrays;
import java.util.LinkedList;  // LinkedList Library methods

//The LinkedList class is a collection based on a Linked List
//instead of an array. They are particularly good when you
//expect to perform many additions and deletions with a 
//collection. When using a linked list you don't have to 
//move items around when you add or delete an item. They 
//aren't particularly suited to providing access based off
//of index searches like an array though. Each object in a
//linked list contains a pointer to the objects that proceed
//and follow it.
//When you change an ArrayList a new array is created by it.


public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Twelve");
		System.out.println("\n");
		
		//General linked list
		LinkedList linkedListOne = new LinkedList();
		
		//Restricted to data type
		LinkedList<String> names = new LinkedList<String>();
	
         names.add("Brian");
         names.add("Noel");
         names.addLast("Martha");
         names.addFirst("Julia");
         
         names.add(0, "Jain");
         names.set(2, "Paul");
         
         names.remove("Julia");
         names.remove(1);
         //Enhaced for loop
         for(String name : names) {
        	 System.out.println(name);
         }
         
         System.out.println("First index " + names.get(0));
         System.out.println("Last index " + names.getLast());
         
         LinkedList<String> nameCopy = new LinkedList<String>(names);
 		
 		// When you print out the LinkedList itself the toString
 		// method is called
 		System.out.println("\nnameCopy: " + nameCopy);
 		
 
 		// You can check if an object is in the list with contains()
 		if(names.contains("Noah Peeters"))
 		{
 			System.out.println("\nNoahs Here");
 		}
       // You can check if everything in one list is in another
 		if(names.containsAll(nameCopy))
 		{
 			System.out.println("\nCollections are the same");
 		}
 		
 		// Return the index for an object with indexOf
 		System.out.println("\nIndex of Ali is: " + names.indexOf("Ali Syed"));

 		// Check if a list is empty with isEmpty()
 		System.out.println("List Empty: " + names.isEmpty());
 	
 		
 		// Get the number of items in the list with size
 		System.out.println("How many values: " + names.size());
 	
 		// peek() retrieves the first element, but doesn't throw an error 
 		// if there is no element to retrieve
 		System.out.println("Look without error: " + names.peek());
 	
 		// poll() returns the first value and deletes it from the list
 		System.out.println("Remove first element: " + nameCopy.poll());
 		
 		// poll() returns the last value and deletes it from the list
 		System.out.println("Remove last element: " + nameCopy.pollLast());
 	
 		// push puts a new element on the front of the list
 		nameCopy.push("Noah Peeters");
 		
 		// pop removes an element on the front of the list
 		nameCopy.pop();
 		
 		System.out.println("\nnameCopy: " + nameCopy);
 	
 		
 		// Create a new array to hold values from the Linked List
 		Object[] nameArray = new Object[4];
 		
 		// toArray converts the LinkedList into an array of objects
 		nameArray = names.toArray();
 		
 		// toString converts items in the array into a String
 		System.out.println(Arrays.toString(nameArray));
 		
 		
 		// clear() deletes everything in the Linked List
 		names.clear();
 		
 		
	}

}
