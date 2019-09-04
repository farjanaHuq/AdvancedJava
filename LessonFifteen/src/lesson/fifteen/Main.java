package lesson.fifteen;

public class Main {

	public static void main(String[] args) {
		
		Vehicle bus = new Vehicle(4, 50.00);
		
		System.out.println("Num of wheels: " + bus.getWheels());
		System.out.println("The speed of the bus is: " + bus.getSpeed());
		
		bus.setCarStrength(10);
        System.out.println("The strength of the car is: "+ bus.getCarStrength());
	}

}
