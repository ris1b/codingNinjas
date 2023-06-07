package interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface{

	public boolean isMotorized() {
		return false;
	}
	public String getCompany() {
		return null;
	}
	
	public int numGears() { //interface of CarInterface
		return 5;
	}

	int x;
    public void cal(int item) {
        x = item * item;           
    }
    
    public void meth() {
    	System.out.println("two");
    }
}
