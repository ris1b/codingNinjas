package inheritance;

public abstract class Vehicle {
	private String color;
	protected int maxSpeed;
	
	public Vehicle() {
		color="red";
		System.out.println("Vehicle's constructor");
		maxSpeed = 60;
	}
	//dzBXmFEd_JkJm3H1V8pWzg
	public Vehicle(int maxSpeed) {
		color = "red";
		System.out.println("Vehicle's max speed");
		this.maxSpeed= maxSpeed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract boolean isMotorized();
	public abstract String getCompany(); //to get the company name of vehcile
	/*Car don't have answer to getCompany so we made Car abstract
	 * We won't be creating Car objects
	 * we want to be specific and will talk about a particular Car
	 * and then have that class answer to getCompany*/
	
	/*final*/ public void print() {
		System.out.println("Vehicle's " + "color " + color + " maxSpeed "+ maxSpeed);
	}
	
	/*PS-below i have commented after starting oops-3*/
//	protected int maxSpeed;	//default scope. i.e. package friendly
//	private String color;
//	
//	public Vehicle(int maxSpeed) {
//		System.out.println("Vehicle's constructor");
//		this.maxSpeed = maxSpeed;
//	}
//	
//	public Vehicle() {
//		System.out.println("Vehicle's Constructor");
//	}
//	
//	public String getColor() {
//		return color;
//	}
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public void print() {
//		System.out.println("Vehicle " + " color " + color + " maxSpeed " + maxSpeed);
//	}

}
