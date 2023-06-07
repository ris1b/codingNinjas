package classesandobjects;

public class ComplexNumberUse {
	public static void main (String [] args) {
//		ComplexNumber c1 = new ComplexNumber(4,5);
//		c1.print(); //2 + i3
//		c1.setReal(4);
//		c1.setImaginary(10);
//		c1.print();		//4 +i6
		 
		ComplexNumber c2= new ComplexNumber(1,2);
//		c1.plus(c2);
//		c1.multiply(c2); 	
//		c1.print();		//4 + i6
//		c2.print();		//2 + i3
//		
		ComplexNumber c3 =new ComplexNumber(2,3);
		c3.multiply(c2);	
		c3.print();		//-5 -i12
//		c2.print();		//2 + i3
//		
//		ComplexNumber c4 =ComplexNumber.add(c1,c2);
//		c1.print();		
//		c2.print();
//		c4.print();
		
		
		/******************
		 * Following is the main function we are using internally.
		 * Refer this for completing the ComplexNumbers class
		 * 
		 
		 public static void main(String[] args) {
				Scanner s = new Scanner(System.in);

				int real1 = s.nextInt();		//real no. from user
				int imaginary1 = s.nextInt();		//imaginary no. from user

				int real2 = s.nextInt();		//real no. from user
				int imaginary2 = s.nextInt();	//imag no. from user

				ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);		//constructor made
				ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

				int choice = s.nextInt();
				 
				if(choice == 1) {
					// Add
					c1.plus(c2);
					c1.print();
				}
				else if(choice == 2) {
					// Multiply
					c1.multiply(c2);
					c1.print();
				}
				else {
					return;
				}
			}
		 ******************/

	}

}
