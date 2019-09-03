package lesson.fourteen;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Fourteen!");

		Animal genericAnimal = new Animal();
		Cats cat1 = new Cats();
		cat1.changeName("Mimi");

		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);

		System.out.println("\n");
		System.out.println(cat1.getName());
		cat1.playWith();
		cat1.walkAround();

		Animal rabbit = new Animal("Tabby", "carrot");
		System.out.println(rabbit.getName() + " eats " + rabbit.favFood);

		Cats newCat = new Cats("Bob", "Tuna", "Ball");
		System.out.println(newCat.getName() + " loves to eat " + newCat.favFood + " plays with " + newCat.favToy + ".");

		acceptAnimal(rabbit);
	}

	public static void acceptAnimal(Animal randomAnimal) {
		System.out.println("\n");
		System.out.println(randomAnimal.getName());
		// In polymorphism you can cast the method from the child's class

		// The interpreter won't find anything that doesn't
		// originally exist in the Animal class however
		// System.out.println(randAnimal.favToy); Throws an ERROR

		// If you want access to fields or methods only found
		// in the Cat class you have to cast the object to
		// that specific class first
		randomAnimal.walkAround();

		// You can use instance of to check what type of object
		// you have. This results in a positive for Animal
		// and for Cat
		if (randomAnimal instanceof Cats) {
			System.out.println(randomAnimal.getName() + " is a Cat");
		}
	}

}
