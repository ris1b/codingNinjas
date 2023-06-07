package classesandobjects;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) /*throws DivideByZeroException*/ {
		if(denominator == 0) {
			//Throw Error
			/*
			 * We want to throw DivideByZeroException (correct name could have been ZeroDenominatorException)
			 * So we created DivideByZeroException whose super class is Exception
			 * and then deal with it 
			 */
/*The exception we raised in constructor is not the right thing to do
 * as it keeps raising exceptions and it becomes cyclic
 * 
 */
//			throw new DivideByZeroException();
			denominator =1;
		} else if(numerator ==0) { //else if added by R
			System.out.println("0");
			return;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
		simplify();		//just to ensure we are always storing fractions in their simplest form !
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int num) throws DivideByZeroException{
		if(num == 0) {
			throw new DivideByZeroException();
			//Throw Error
//			System.out.println("Denominator cannot be Zero");
//			return;
		}
		this.denominator =num;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
//	public void getFraction() { //Rishab created it
////		if(denominator ==0) {
////			return;
////		}
//		simplify();
//	}
	
//	public Fraction() {
//		
//	}
	
	private void simplify() {			//private as we want to use if for internal logic
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2; i<=smaller; i++) {
			if(numerator % i == 0 && denominator % i ==0) {
				gcd = i;
			}
		}
		numerator =numerator/gcd;
		denominator =denominator/gcd;	
	}
	
	public void increment() {		//increments the fraction on which you're calling this function
		numerator = numerator + denominator;
		simplify();
	}
	
	public void subtract(Fraction f2) {
		this.numerator=this.numerator*f2.denominator  - this.denominator*f2.numerator ;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public static Fraction subtract(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNum =f1.numerator * f2.denominator - f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction (newNum, newDeno);
		/*Because here we were getting an error, so here we will add a throws declaration in this 
		 * function as well
		 * 
		 */
		return f3;
	}
	
	public void multiply(Fraction f2){
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static Fraction multiply(Fraction f1, Fraction f2) throws DivideByZeroException{
		int newNum = f1.numerator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction( newNum,newDeno);	//added throws declaration
		return f3;
	}
	
	public void add(Fraction f2) {			//f2 is an argument being passed, can also be f or anything we like.
		//First fraction is the fraction on which function is called
		//Second fraction is passed as arguments 
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator=this.denominator * f2.denominator;
		simplify();
	}	
	
	public static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException{			//line 1
		int NewNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;	//line 2
		int NewDenom=f1.denominator * f2.denominator;		//line 3
		Fraction f3= new Fraction(NewNum,NewDenom);			//line 4 //Constructor has an implicit call to the simplify()
		return f3;		//line 5 //returning fraction f3 !
		
	}		
	
	public void print() {
		if(numerator==0) { //added by R
			return;
		}
		System.out.println(numerator +"/" + denominator);
	}
	
	
	
	/*
	 * how may I help you
	 * as your functions return type is Fraction
	 * so it seems that it can return a Fraction type of value
	 * which we store in a Fraction object 
	 * as we see when we make return type as int 
	 * then it should return a int type value 
	 * and we may store that returned value in a int type variable and use that int variable as our required 
	 * here we can return a Fraction object from the add function 
	 * and store into any Fraction type variable
	 * as you also see in the video in FractionUse class methode at line no. 17
	 * at time stamp 10:20
	 * we can store it in f3 variable which is of Fraction type
	 * so hope you understand from above explanation
	 * for now I have marked resolve but if you have still doubt the let us know	
	 */
	
	/*
	 * actually the return type is always a class

int, void char have all their classes mad internally


so if u make a fraction class,


u can also specify it as a return method


then the retuned answer will follow all the properties that u mentioned in Fractyion class


Basically u are making a customized return type other than java language has already provided you..
	 */
	
	/*
	 * hey, in the add function, the return type is Fraction

Rishabh Jiwani09/03/22 22:43

okay

so usually the return types are void, or int , string ,char

so here

we are returning the Object of class Fraction ??


yes


Fraction is class and f3 is the object of that class


so we return an object of that class in


Fraction f3=add(Fraction f1, Fraction f2):


it will receive that object in f3 that we have returned in add function


as Fraction is a class of basically two variables num and den 
so by using constructor it will set those values and simplify that acc to it


did u got it/


?

just a second


ok

okay got it


okay great

'so basically we just returned object of the class fraction


yes


we just return the object 

and can we return any other object of other class here?>


if it is private and in another package then no


other wise yes

int, void etc are java defined,

and fraction is user defined return type


yes they are primitive data types


but class is not a data type


we define it on our own


yes 
	 */
}
