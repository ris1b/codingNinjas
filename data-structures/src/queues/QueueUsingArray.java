package queues;

public class QueueUsingArray {
	
	private int data [];
	private int front;
	private int rear;
	private int size;
	
	QueueUsingArray(){
		data = new int[5];
		this.front = -1;
		this.rear = -1;
	}
	
	QueueUsingArray(int capacity){
		data = new int [capacity];
		this.front = -1;
		this.rear = -1;
	}
	
	public int front() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enqueue(int elem){
		//adds element at the end of Queue
		if(size == data.length) {
			//throw new QueueFullException(); //Now we want to Double the Capacity
			doubleCapacity();
		}
		if(size == 0) {
			front = 0;	//or increase front by 1
		}
//		rear++;
//		if(rear == data.length) {
//			rear = 0;		//CIRCULAR QUEUE!
//		}
		rear = (rear + 1)% data.length;
		data[rear] = elem;
		size ++;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		int index = 0;
		for(int i= front; i<temp.length; i++) {
			data[index++] = temp[i];
		}
		for(int i=0; i<front - 1; i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length - 1;
	}

	public int dequeue() throws QueueEmptyException {
		//removes element from front of Queue
		if(size == 0) {
			throw new QueueEmptyException();//queue is empty
		}
		int temp = data[front];
//		front ++;
//		if(front == data.length) {
//			front = 0;
//		}
		front = (front + 1)% data.length;
		size --;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
//		rear does not change.
		return temp;
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
}
