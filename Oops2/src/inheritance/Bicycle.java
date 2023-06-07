package inheritance;

public abstract class Bicycle extends Vehicle{
	
	public boolean isMotorized() {
		return false;
	}
	
	public Bicycle() {
		super(100);//explicitly invoked another constructor
	}
//	int maxSpeed;	//will remove it, and move to vehicle class
//	String color;	//will remove it, and move to vehicle class

	/*
	 * now, we will state that Bicycle is inheriting properties from Vehicle
	 */
}
