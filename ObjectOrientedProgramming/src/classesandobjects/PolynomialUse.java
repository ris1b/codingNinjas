package classesandobjects;
import java.util.Scanner;

public class PolynomialUse {
	/* Signature of four required functions is given in the code.
	 * You can create other functions as well if you need.
	*  Also you should submit your code even if you are not done with all the
	*  functions. 
	*/

	// Main used internally is shown here just for your reference.
	public static void main(String[] args) {
			try (Scanner s = new Scanner(System.in)) {
				int n = s.nextInt();	//count of no. of coefficients in P1
				int degree1[] = new int[n];		//degree array in P1
				for(int i = 0; i < n; i++){
					degree1[i] = s.nextInt();//taking input and filling degree in array
				}
				int coeff1[] = new int[n];	//coeff array in p1
				for(int i = 0; i < n; i++){
					coeff1[i] = s.nextInt();//taking input and filling coeff in array
				}
				Polynomial first = new Polynomial();//first object of Polynomial class
				for(int i = 0; i < n; i++){
					//calling set.Coeff() of Polynomial class
					first.setCoefficient(degree1[i],coeff1[i]);
				}
				n = s.nextInt();//count of no. of coeff in P2
				int degree2[] = new int[n];
				for(int i = 0; i < n; i++){
					degree2[i] = s.nextInt();
				}
				 int coeff2[] = new int[n];
				for(int i = 0; i < n; i++){
					coeff2[i] = s.nextInt();
				}
				Polynomial second = new Polynomial();
				for(int i = 0; i < n; i++){
					second.setCoefficient(degree2[i],coeff2[i]);
				}
				//evaluate function :--->
				n=s.nextInt();
				int degree3[]=new int [n];
				for(int i=0; i<n; i++) {
					degree3[i] = s.nextInt();
				}
				int coeff3[]=new int[n];
				for(int i=0; i<n;i++) {
					coeff3[i] = s.nextInt();
				}
				Polynomial third = new Polynomial();
				for(int i=0;i<n;i++) {
					third.setCoefficient(degree3[i], coeff3[i]);
				}
				int x=s.nextInt();
				
				int choice = s.nextInt();
				Polynomial result; //local variable
				switch(choice){
				// Add
				case 1: 
					 result = first.add(second);
					result.print();
					break;
				// Subtract	
				case 2 :
					 result = first.subtract(second);
					result.print();
					break;
				// Multiply
				case 3 :
					 result = first.multiply(second);
					result.print();
					break;
				// Evaluate
				case 4 :
					int eval=third.eval(x);
					System.out.println(eval);
					break;
					
				}
			}

		}
}
/*
Polynomial Class Problem
Send Feedback
Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is
not there in the polynomial, then corresponding term (with specified degree and value) is added.
If the term is already present in the polynomial, then previous coefficient value is replaced by
given coefficient value.
2. add -
Adds two polynomials and returns a new polynomial which has the result.
3. subtract -
Subtracts two polynomials and returns a new polynomial which has the result.
4. multiply -
Multiplies two polynomials and returns a new polynomial which has the result.
5. print -
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order
of degree.
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
Note : Only keep those terms which have non - zero coefficients.
Input Format:
The first line of input contains count of the number of coefficients in polynomial 1(C1)
The next line of input has C1 degrees for polynomial 1.
The next line of input has C1 coefficients for polynomial 1.  
The next line of input contains count of the number of coefficients in polynomial 2(C2)
The next line of input has C2 degrees for polynomial 2.
The next line of input has C2 coefficients for polynomial 2.  
The next line of input has the choice for the function you want to implement.
Output Format:
The output will be printed in case of print function same as that of print function format.
Sample Input 1 :
P1 : 1x2 2x3 4x6 
P2 : 3x4 1x2
Sample Output 1 :
P1 + P2 = 2x2 2x3 3x4 4x6
Sample Input 2 :
P1 : 1x2 2x3 4x6 
P2 : 3x4 1x2
Sample Output 2 :
P1 - P2 = 2x3 -3x4 4x6
*/