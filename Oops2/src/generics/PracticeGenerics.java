package generics;

public class PracticeGenerics <T> {
	private T first;
	protected T second;
	
	public PracticeGenerics(T color, T color2) {
		this.first=color;
		System.out.println("Vehicle's constructor");
		this.second = color2;
	}
	public PracticeGenerics(T maxSpeed) {
		System.out.println("Vehicle's max speed");
		this.first= maxSpeed;
	}
	
	public T getColor() {
		return first;
	}
	
	public void setColor(T color) {
		this.first = color;
	}
	
//	private T first;
//	private T second;
//		
//	public PracticeGenerics(T first, T second) {
//		this.first = first;
//		this.second = second;
//	}
//	
//	public T getFirst() {
//		return first;
//	}
//	
//	public void setFirst(T first) {
//		this.first = first;
//	}
//	
//	public T getSecond() {
//		return second;
//	}
//	
//	public void setSecond(T second) {
//		this.second = second;
//	}
}
