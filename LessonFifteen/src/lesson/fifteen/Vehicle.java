package lesson.fifteen;

public class Vehicle implements Drivable {
	
	int numOfWheels = 4;
	double theSpeed = 40;
	
	int strength = 0;


	public void setWheels(int numOfWheels) {
		 this.numOfWheels = numOfWheels;		
	}
	
	@Override
	public int getWheels() {
		return this.numOfWheels;
	}

	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;	
	}

	public double  getSpeed() {
		return this.theSpeed;
		
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	
	}
	
	public int getStrength(){
		return this.strength;
	}

	public Vehicle() {}
	
	public Vehicle(int noOfWheels, double speed) {
		this.numOfWheels = noOfWheels;
		this.theSpeed = speed;
	}
	
	

}
