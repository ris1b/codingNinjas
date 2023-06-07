package inheritance;

public class Audi extends Car{
	 Audi() {
		 super(2,320); //Making Explicit call to Car constructor--> 2 doors, MaxSpeed 320
		 System.out.print("This Is Audi ");
//		    super();
		    }

	public static void main(String[] args) {
		Audi a = new Audi();
	}
	
	public String getCompany() {
		return "Audi";
	}

}
