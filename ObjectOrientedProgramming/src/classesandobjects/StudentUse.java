package classesandobjects;
//import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		
		//Scanner s=new Scanner(System.in);
		//Scanner is a class, s is object of this class
		/*
		 * We created objects of Scanner class and we used the functionality of these object
		 * as well like s.nextInt() s.nextDouble() s.next() s.nextLine() 
		 */
		
		//Similarly we will create object of Student class :
		
		Student s1= new Student("Rishabh");		//new keyword - creating object of the class Student
//		System.out.println(Student.numStudents); //here we can change the num of students to any value which would break our code in students class
//so we have made numStudents access to private. we can now access them via getter i.e. getNumStudents()
//		System.out.println(s1.getNumStudents()); //The static method getNumStudents() from the type Student should be accessed in a static way
		Student s2=new Student();	
		System.out.println(Student.getNumStudents());
//		System.out.println(s1.getNumStudents()); //The static method getNumStudents() from the type Student should be accessed in a static way

//		Student.numStudents = 3;
//		System.out.println(Student.numStudents);
		
		
//		System.out.println(s2.numStudents); //The static field Student.numStudents should be accessed in a static way
//		System.out.println(Student.numStudents);
//		Student s3=new Student();
//		System.out.println(Student.numStudents);
		

//		s1.print();
//		s2.print();
	
		
//		s1.name = "Rishabh";
//		System.out.println("s1 " + s1);				//s1 has the reference of the object
//		s1.setRollNo(100);
//		System.out.println(s1.name + " " + s1.getRollNo());
		
//		System.out.println("Oh, Hi "+s2.name);
//		s2.setRollNo(15);
//		System.out.println("s2 "+ s2);

		
//		System.out.println(s1.name + " " );//+ s1.rollNo);
//		s1.rollNo =10;
		
		
	}

}
