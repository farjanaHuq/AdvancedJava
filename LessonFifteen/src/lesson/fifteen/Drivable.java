package lesson.fifteen;

public interface Drivable {
	//You cannot basically create or change any field in interface, if you need any constant 
	//to define inside the interface, you can do that.
	double PI = 3.1415;
	
	void setWheels(int numOfWheels);
	int getWheels();
	
	void setSpeed(double speed);
	double getSpeed();

}
