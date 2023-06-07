package classesandobjects;

public class FractionUse {
	
	public static void main(String[] args) {
		Fraction f1= new Fraction(1,2); //this constructor tells us that we need to have two
		//properties in our Fraction class i.e. numerator & denominator
//		f1.print();
//		f1.increment();
//		f1.print();
		
		//want to add two fractions
		Fraction f2 = new Fraction(1,2); 
//		f1.add(f2);
//		f1.print();
//		f1.subtract(f2);
//		f1.print();
//		f1.multiply(f2);
//		f1.print();
//		Fraction f3 = Fraction.add(f1, f2);
//		f3.print();
		
//		f2.setNumerator(25);			//setting numerator of f2 Fraction
//		f2.setDenominator(10);			//setting denominator of f2 Fraction
//		System.out.println(f1.getNumerator());
//		f1.add(f2);		//Calling add function on f1(-->so f1 will be added) and passing f2 fraction(--> so f1 will be added with f2)
		
		/*
		 * let,
		 * s1.name ="Rishabh"; //s1 is calling its name property and initializing value to it
		 * s1.RaiseDoubt(); //s1 is calling a function i.e. RaiseDoubt in order to raise a doubt
		 * in the edu portal, doubt will be raised for s1 object and not for every student
		 * because RaiseDoubt function is called by s1
		 */
//		Fraction f3 = new Fraction();
//		f3.add(f1,f2);
//		f3.print(); 
//		Fraction f3= Fraction.add(f1, f2);
//		Fraction f3= Fraction.multiply(f1, f2);
//		f3.print();
		
		
		try {
			Fraction f4= Fraction.subtract(f1, f2);
			f4.print();
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Fraction f4= Fraction.subtract(f1, f2);
//		f4.print();
	}

}
