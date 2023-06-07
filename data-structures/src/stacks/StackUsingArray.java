package stacks;

public class StackUsingArray {

	private int data[];	//data will be the reference to the array
	private int topIndex;
	
	public StackUsingArray() {
		data = new int [3];
		topIndex = -1;
	}
	public StackUsingArray(int size) {
		data = new int [size];
		topIndex = -1;
	}
	
	//O(1)
	public int size() {
		return topIndex + 1;
	}
	
	// O(1)
	public boolean isEmpty() {
		return topIndex == -1;
	}
	// O(1)
	public void push(int elem) throws StackIsFull{
		//If stack is full--> then double capacity
		if(topIndex == data.length - 1){
			System.out.println("Double capacity");
			doubleCapacity();
		}
		data[++topIndex] = elem;
	}
	
	private void doubleCapacity() {
		System.out.println("Double Capacity");
		int temp [] = data;
		data = new int [2 * temp.length];
		for(int i=0; i< temp.length; i++) {
			data[i] = temp[i];
		}
	}
	// O(1)
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			// Throw StackEmptyException
			throw new StackEmptyException();
		}else {
			return data[topIndex];
		}
	}
	
	// O(1)
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			// Throw StackEmptyException
			throw new StackEmptyException();
		}else {
			int temp = data[topIndex];
			topIndex--;
			return temp;
		}
	}
	
}
