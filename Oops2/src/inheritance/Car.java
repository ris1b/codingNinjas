package inheritance;

public abstract class Car extends Vehicle {
	int numDoors;
	int numGears;
	
	public Car() {
//		super(100);
		System.out.println("Car's constructors");
		numDoors = 4;
		numGears = 5;
	}
	
	public Car(int numDoors, int maxSpeed) {
		super(maxSpeed);
		System.out.println("Car's Constructor");
		this.numDoors = numDoors;
	}
	
	public void print() {
//		super.print();
		System.out.println("Car's numDoors " + numDoors + " numGears " + numGears);
	}
	
	public void printMaxSpeed() {
		maxSpeed = 150;
		System.out.println(maxSpeed + " " + maxSpeed);
	}

	@Override
	public boolean isMotorized() { //Car has answer to isMotorized or not !
		// TODO Auto-generated method stub
		return true;
		/*we implemented the un-implemented method and return rather than making Car Class
		 * as Abstract*/
		/*i.e. we defined isMotorized method*/
	}
	
	
	/*PS-below i have commented after starting oops-3*/
////	int maxSpeed;	//will remove it, and move to vehicle class
////	String color;	//will remove it, and move to vehicle class
//	/*
//	 * now, we will state that Car is inheriting properties from Vehicle
//	 */
//	int numDoors;
////	int maxSpeed;
//	
//	public Car(int numDoors, int maxSpeed) {
//		super(maxSpeed);	//Explicitly making call to the constructor of vehicle having two parameters
//		System.out.println("Car's constructor");
//		this.numDoors=numDoors;
//	}
//	
//	public void printMaxSpeed() {
////		super.maxSpeed= 150;
//		System.out.println(maxSpeed + " " + super.maxSpeed);
//	}
//	
//	public void print() {	//overrides inheritance.Vehicle.print
//		super.print();
//		System.out.println("Car " + " numDoors " + numDoors);
//		
//		/*Below comment have explanation for above super keyword
//		 * In Car class, in the print function we want only print the properties which are in the Car class
//		 * We still want to print other properties present in Vehicle Class, but for that we want to use Vehicle's function.
//		 * So within this function, we should call print function of Vehicle.
//		 * To do so, we need to write :
//		 * super.print();
//		 */
////		System.out.println("Car " + " color " + getColor() + " maxSpeed " + maxSpeed + " numDoors " + numDoors);
//		
//		/*
//		 * So now when we call c.print();
//		 * basically two functions are being called
//		 * 1--> car.print();
//		 * 2--> vehicle.print(); //which we are calling implicitly. 
//		 */
//	}
//	
//	/*
//	 * Commented after learning function overriding
//	public void printCar() {
//		System.out.println("Car " + " color " + getColor() + " maxSpeed " + maxSpeed + " numDoors " + numDoors);
//	}
//	*/
//	
}


/*
was the initial core member of the startup and was there with it from its creation to successful completion.
Being the lead developer and architect for substantial part of the product, I developed a performance monitoring tool
for java based products which stood out from all the existing tools in the market and generated high business value for
the users.
*/


/*JCO GAS PIPE LTD. 
 * Handled GeM Portal for the Chokhani Group of Companies. 
 * */

/*I was able to identify problems in this marketplace with the support of my Managing Director,
 *which helped me better grasp this marketplace.
 */

/*Making Partner Associations with various OEMs and National Distributors was my responsibility.
 * Partner OEM's - HP,RDP,Dell,Kyocera,Havells,Blisco,Geeken etc.
 * Partner Distributors- Redington, Intigra & Udaan, Iris Global
 */

/*
 * I was successful in winning Reverse auction against OEM's such as Dell.
 * I have successfully won many bids on Govt-E-Marketplace
*/

/*
 * In my organisation, I was always willing to learn new things and was always willing to share my knowledge,
 * which helped me manage the team successfully and create high synergy.
 * In my organisation, I was always open to learning new things and was always willing to share my knowledge,
 * which helped me manage the team successfully and create high synergy.
 */
