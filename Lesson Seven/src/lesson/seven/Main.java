package lesson.seven;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Lesson Seven");
		
		Monster Frank = new Monster();
		Frank.name = "Frank";
		
		System.out.println(Frank.name + "has an attack of " +Frank.getAttack());

	}

}
