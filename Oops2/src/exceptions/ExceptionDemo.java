package exceptions;

public class ExceptionDemo {
	
	
	public static int fact(int n) throws NegativeNumberException{
		if(n < 0) {
			throw new NegativeNumberException();
		}
		for(int i=1;i<n;i++) {
			n *=i;
		}
		return n;
	}

	public static int divide(int a, int b) throws DivideByZeroException{
		//divide passes exception to whoever has called divide function
		//main has called it
		if(b == 0) {
			throw new DivideByZeroException();
			//throw new ArithmeticException();//new creates the object
			/*Since DivideByZeroException is a checked exception
			 * the compiler will expect you to decide
			 * what should be the step once this exception has occured
			 */
		}
		return a/b;
	}
	
	public static void main(String[] args){
		//main also passes the exception to whoever has called it
		//the system has called main
		try {
			divide(10,0);
			System.out.println(fact(2));//this is a checked exception so we will have to deal with it
			System.out.println("Within try");
		}catch(DivideByZeroException e){
			//catch block is dealt with only in the scenario when the exception is raised
			System.out.println("Divide by zero exception raised");
//			e.printStackTrace();
		}
		catch(NegativeNumberException e) {
			System.out.println("Number is negative");
		} catch(Exception e) {
			System.out.println("Generic Exception");
		}
		System.out.println("Main");
	} 
}
