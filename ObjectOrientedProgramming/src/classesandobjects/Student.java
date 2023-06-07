package classesandobjects;

public class Student {
	
	//We want Student to have certain set of properties
	//Specifying some properties: name, roll no.
	
	public String name;		//we want Student to have name
	final private int rollNo;		//we want Student to have roll number
	double cpga;							  //* Final keyword is a non-access modifier.
	public final static double CONVERSIONFACTOR =0.95;	 //* We can initialize final variable inside a function.
											//* We can initialize final variable inside constructor.
	private static int numStudents; //no. of students
	
	//Creating Constructor
	public Student(String n) {
		name=n;
		numStudents++;		//constructor is called when this object is created, then numStudents will be incremented
		rollNo=numStudents;
	}
	
	//making a getter to get value of numStudents readable
	public static int getNumStudents() {
		System.out.println();
		return numStudents;
	}

	//Constructor expecting just name
	public Student() {
		this.name = "abc";
		numStudents++;
		rollNo=numStudents;
		//this.rollNo = 99;
	}
	
//	public Student() {
//		name = "abc";
//		numStudents++;
//		rollNo=numStudents;
//		//rollNo = 0;
//	}
	
	//Function to print name and roll no.
	public void print() {
		System.out.println(name + " " + rollNo);
		
	}
	
	public void setRollNo(int rollNo) {
		if(rollNo <=0) {
			return;
		}
		//System.out.println("this " + this);
//		this.rollNo = rollNo; //commented this statement as we made our rollNo final, we cant initialize final variable inside a function
		//this has the reference to object on which setRollNo() was being called.
		//We can use this to differentiate b/w the properties of an object and a local variable
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	private String month;
	public void set_month(String str) {
		if(str == "Jan" || str == "Feb" || str == "jan" || str == "feb") {
			System.out.println("Enter current month or upcoming month");
		} else if (str.length() > 3) {
			System.out.println("length exceeds");
		} else {
			this.month = str;
		}
	}
	public void print_month() {
		System.out.println(month);
	}
	
	/*
	 * Note: by creating a class, doesn't mean we have
	 * created an object !
	 * We have just created a class, & class specifies the template
	 * We will have to write code separately to write objects of this class !!
	 */
	
	/*
	 * This problem may have one or more correct answers
	 * Final variable can be initialized only once and cannot be modified further.
	 */
}
