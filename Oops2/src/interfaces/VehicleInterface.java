package interfaces;

public interface VehicleInterface {
/*All the methods in interfaces are public and abstract by default*/
//	public abstract boolean isMotorized();
//	public abstract String getCompany();
//	So we can write it as below:
	
	double PI = 3.14; //it is public, final, static by default 
/*all variables in an interface are public, final& static by default*/
	
	boolean isMotorized();
	String getCompany();
	
	int numGears();
	
}
