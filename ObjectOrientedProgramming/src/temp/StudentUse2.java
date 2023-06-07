package temp;

import classesandobjects.Student;

public class StudentUse2 {
	public static void main(String [] args) {
		Student s1= new Student("abc");
//		Student s1= new Student("abc",123);
//		System.out.println(s1.name);
//		s1.name = "JackChanged";
//		s1.print();
//		s1.month="march";
		s1.set_month("mar");
		s1.print_month();
//		System.out.println(s1.name);
		
	}

}
