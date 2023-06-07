package inheritance_temp;
import inheritance.Vehicle;
public class Truck extends Vehicle{
	public Truck() {
		super(110); //Making Explicit call
	}
	Truck t=new Truck();
	int maxCapacity;

	public void print() {
		System.out.println("Vehicle " + " color " + getColor() + " maxSpeed " +
				maxSpeed +" maxCapacity "+ maxCapacity);

	}

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String getCompany() {
		return "Truck-Please make class like Eicher, Volvo, Tata to get name"
				+ "of the Truck and then make that class inherit Truck and have"
				+ "answer to getCompany method" +"Then we should make the Truck "
						+ " class abstract, if we want to make it abstract now then"
						+ "we won't be able to use Truck Object";
	}

}
