package interfaces;

public class Vehicle /*implements VehicleInterface*/{
/*if Vehicle don't implement these two methods, then Vehicle has to declare itself
 * abstract or the other option which it has is to implement these methods.*/
	
	/*WE DONT WANT VEHICLE TO HAVE ANSWERS TO INCOMPLETENESS OF VEHICLEINTERFACE
	 * SO WE WILL BE REMOVING THE BELOW ABSTRACT METHODS*/
	/*
	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}
	void print () {
//		System.out.println("Vehicle");
		System.out.println(PI);
	}
	*/
	void print() {
		System.out.println("Vehicle");
	}
	
	void meth () {
		System.out.println("One");
	}

	
}
