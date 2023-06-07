package classesandobjects;

public class ComplexNumber {
	private int real;		//cn did not made real & imaginary private
	private int imaginary;
	
	ComplexNumber(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void plus(ComplexNumber c2) {
		int real= this.real + c2.real;
		int imaginary= this.imaginary +c2.imaginary;
		this.real = real;
		this.imaginary=imaginary;
//		this.real = this.real + c2.real;	//code by rishabh
//		this.imaginary =this.imaginary + c2.imaginary;	//code by rishabh
	}
	
	void multiply(ComplexNumber c2) {
		int real=(this.real*c2.real)-(this.imaginary*c2.imaginary);
		int imaginary=(this.real*c2.imaginary) + (this.imaginary*c2.real);
		this.real = real;
		this.imaginary = imaginary;
		
		/* Code by rishabh
		int tempObj=this.imaginary;
		int tempc2=c2.imaginary;
		this.imaginary = this.real*c2.imaginary + this.imaginary*c2.real;
		this.real = this.real*c2.real - (tempObj*tempc2);
		*/
	}
	
	void print() {
		System.out.println(this.real + " + i" + this.imaginary);
		
		/* Code by rishabh
		System.out.println(real + " " + "+" + " " + "i" + imaginary);
		*/
	}	
	/*
	 * CN made ComplexNumber constructor, plus(), multiply, print() all these methods have default access instead of
	 * public access. So we also set their access to default.
	 */
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		
		int newReal = c1.real + c2.real;
		int newImaginary = c1.imaginary + c2.imaginary;
		ComplexNumber c4= new ComplexNumber(newReal, newImaginary);
		return c4;
	}
	
//	public void setReal(int realNo) {
//	this.real = realNo;
//}

//public void setImaginary(int imaginary) {
//	this.imaginary = imaginary;
//}
}
/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
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



/*
Complex Number Problem
Send Feedback
A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I)
(both integers).
Implement the Complex numbers class that contains following functions -
1. constructor
You need to create the appropriate constructor.
2. plus -
This function adds two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1
3. multiply -
This function multiplies two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2
4. print -
This function prints the given complex number in the following format :
a + ib
Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
Input Format :
Line 1 : Two integers - real and imaginary part of 1st complex number
Line 2 : Two integers - real and imaginary part of 2nd complex number
Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents
multiply function will be called)
Output format :
Check details of 'print' function given above.
Sample Input 1 :
4 5
6 7
1
Sample Output 1 :
10 + i12
Sample Input 2 :
4 5
6 7
2
Sample Output 2 :
-11 + i58
*/
