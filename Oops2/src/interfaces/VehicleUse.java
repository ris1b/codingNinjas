package interfaces;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle(); //this is allowed
//		VehicleInterface vi = new VehicleInterface(); //this is not allowed
		VehicleInterface vi; //We can create it's reference
		
//		vi = new Vehicle();
////		vi.print(); //can't access Vehicle specific methods
//		vi.getCompany(); //can access only those property that are in the interface
		
		 Car arr = new Car();
	        arr.x = 0;     
	        arr.cal(2);
	        System.out.print(arr.x);
	        
	        CarInterface a = new Car() ; 
	        a.meth();
		
	}

}
