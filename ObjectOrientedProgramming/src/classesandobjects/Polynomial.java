package classesandobjects;

public class Polynomial {
	int coeffArray[];
	
	Polynomial(){
		coeffArray=new int[10];
	}
	
	public void setCoefficient(int degree,int coeff){
		if(degree> coeffArray.length-1){
			int temp[]= coeffArray;
			//Create a new array with size=degree +1
			coeffArray=new int[degree+1];
			/*-->Updating array
			 * if degree is greater than length of array,
			 * then we will make the array length equal to 
			 * degree + 1
			 * So if degree is 20, then array length will become 21.
			 */
			//Copy values from temp to coeffArray
			for(int i=0;i<temp.length;i++){
				coeffArray[i]=temp[i];//will place the coeff at position=degree
			}
		}
		coeffArray[degree]=coeff;
	}
	//Print all the terms(only terms with non-zero elements are to be printed)
	public void print(){
		for(int i=0;i< coeffArray.length;i++){
			if( coeffArray[i]!=0){ 
				System.out.print(coeffArray[i]+"x"+i+" ");
			}
		}
	}
	//Add two polynomials and stor result in ans, return ans
	public Polynomial add(Polynomial p){
		Polynomial ans=new Polynomial();
		int plen1=this.coeffArray.length;
		int plen2=p.coeffArray.length;
		int len=Math.min(plen1,plen2);
		
		int i; //we placed i outside for loop, as we want it to be accessible to other loops also
		for(i=0;i<len;i++){
			ans.setCoefficient(i,this.coeffArray[i]+p.coeffArray[i]);//ans.coeffArray, will be updated/set

		}
		while(i<plen1){

			ans.setCoefficient(i,this.coeffArray[i]);
			i++;//added
		}
		while(i<plen2){

			ans.setCoefficient(i,p.coeffArray[i]);
			i++;//added
		}
		return ans;

	}
	public Polynomial subtract(Polynomial p){
		int plen1=this.coeffArray.length;
		int plen2=p.coeffArray.length;
		int len=Math.min(plen1,plen2);
		Polynomial ans=new Polynomial();
		int i;
		for(i=0;i<len;i++){
			ans.setCoefficient(i,this.coeffArray[i]-p.coeffArray[i]);
		}
		while(i<plen1){
			ans.setCoefficient(i,this.coeffArray[i]);
			i++; //added  
		}
		while(i<plen2){
			ans.setCoefficient(i,-p.coeffArray[i]);
			i++;//added
		}
		return ans;
	}
/* ---> get function is used in cn solution
	* whichever term(or say, coefficient) is at the newdeg position,we will return that term and 
	* store it in other term. Because in multiplying,we multiply and add like terms to get final answer.
	public int getCoefficient(int degree) {
		if(degree < this.coeffArray.length) {
			return coeffArray[degree];
		}
		else {
			return 0;
		}
	}
*/
	
	public Polynomial multiply(Polynomial p){

		Polynomial ans=new Polynomial();

		for(int i=0; i<this.coeffArray.length; i++){
			for(int j=0; j<p.coeffArray.length; j++){

				int newdeg=i+j;
				int termCoeff=this.coeffArray[i]*p.coeffArray[j];
				int otherterm=0; //in cn solution--> otherterm=ans.getgetCoefficient(newdeg);
				if(newdeg<ans.coeffArray.length)
					otherterm=ans.coeffArray[newdeg];
				ans.setCoefficient(newdeg,termCoeff+otherterm);
			}
		}

		return ans;
	}
	
	void evaluate(int degree, int coeff, int x) {
		int prod=1;
		for(int i=0;i<degree;i++) {
			prod = prod * x;
		}
		this.coeffArray[degree] = coeff * prod;
		
	}
	
	public int eval(int x) {
		Polynomial ans = new Polynomial();
		for(int i=0;i<this.coeffArray.length; i++) {
			ans.evaluate(i,this.coeffArray[i],x);
		}
		int sum=0;
		for(int i=0; i<ans.coeffArray.length;i++) {
			sum += ans.coeffArray[i];
		}
		
		return sum;
	}
}
/*
 * Encapsulation is hiding of data from outside world.
Abstraction means showing only necessary details to the user.
Inheritance is acquiring properties of other class.
Java is not an object oriented language.
 */

/* 
	XXX---Comment Start here---XXX
	//below code has correct approach to the problem, problem occurred in updating array
	//size, were able to add() and subtract for some test cases, could not multiply for any test case.
	DynamicArray coefficients;
	int [] poly;
	int lastIndex;
	Polynomial(){
		poly = new int[5]; //at first initialized an array of 5 length
		lastIndex = poly.length-1;
	}

	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
 *  is already present in the polynomial then previous coefficient is replaced by
 *  new coefficient value passed as function argument
 *  /
	public void setCoefficient(int degree, int coeff){ //(degree=3, coeff=1)
		if(degree >= poly.length) {
			doubleCapacity();
		}

		poly[degree] = coeff; 	//thus we have set coeffs in poly[]
								//in poly[], the indexes are equivalent to degree
	}

	private void doubleCapacity() {
		int temp[]= poly;
		poly = new int [2 * poly.length];
		for(int i=0; i<temp.length; i++) {
			poly[i] = temp[i];
		}
	}

	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0; i<poly.length; i++) {
			if(poly[i] == 0) {
				continue;
			}
			System.out.print(poly[i] +"x" +i+" ");
		}
	}


	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
//		p.doubleCapacity();
		int temp[]=p.poly;
		p.poly = new int [this.poly.length];
		for(int i=0;i<temp.length;i++) {
			p.poly[i] = temp[i];
		}

		for(int i=0; i< poly.length; i++) {
//			if(i == this.poly.length) {
//				this.doubleCapacity();
//			} else if(i == p.poly.length) {
//				p.doubleCapacity();
//			}
			if(this.poly[i] ==0 && p.poly[i] == 0) {
				continue;
			}
			this.poly[i] = this.poly[i] + p.poly[i];
		}
		return this;
	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int temp[]=p.poly;
		p.poly = new int [this.poly.length];
		for(int i=0;i<temp.length;i++) {
			p.poly[i] = temp[i];
		}

		for(int i=0; i< poly.length; i++) {
			if(poly[i] ==0 && p.poly[i] == 0) {
				continue;
			}
			this.poly[i] = this.poly[i] - p.poly[i];
		}	
		return this;
	}

	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int [] p3 = new int[this.poly.length + p.poly.length];
		int i=0;
		for(;i<p3.length;i++)
		{
//			while (this.poly[i] !=0)
//			{
				int j=0;
				for(;j<p.poly.length;j++)
				{
//					while (p.poly[j] !=0)
//					{
						p3[i+j] += this.poly[i] * p.poly[j];
//						j++;
//					}
				}
//				i++;
//			}
		}
		this.poly=p3;
		return this;
	}	
}
	 XXX Comment Ends here XXX			*/
