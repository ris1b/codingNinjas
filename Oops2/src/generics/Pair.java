package generics;

public class Pair <T , S>{
/*this class is a pair of two integers, it collects two integers*/

	private T first;//These are just references and not any Object. We have not made them point
	private S second;//to any object
		
	public Pair() {}	//Default Constructor
	
	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public void setFirst(T first) {
		this.first = first;
	}
	
	public S getSecond() {
		return second;
	}
	
	public void setSecond(S second) {
		this.second = second;
	}
}
