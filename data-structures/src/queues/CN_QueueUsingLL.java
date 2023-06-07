package queues;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
/*<---------------------YOUR CODE PART------------->*/
/*public*/ class Queue {
	
	//Define the data members
    private Node front;
    private Node rear;
    private int size;

	public Queue() {
		//Implement the Constructor
        front = null;
        rear = null;
        size = 0;
        
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return (size == 0);
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node current = new Node(data);
        // if(front == null && rear == null){
        if(size==0){
            front = current;
            rear = current;
            size++;
            return;
        }
        rear.next = current;
        rear = current;
        size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        
        Node temp = front; 
        if(size == 0) { 
            front = null; 
            rear = null;
            return -1;
        }else {
            front = front.next; 
            temp.next = null;
        } 
        size--;
        return temp.data;
    }


    public int front() {
    	//Implement the front() function
        if(size == 0){
            return -1;
        }
        return front.data;
    }
}
/*
Query-1(Denoted by an integer 1): Enqueues an integer data to the queue.

Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the queue and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the front of the queue but doesn't remove it, unlike the dequeue function.

Query-4(Denoted by an integer 4): Returns the current size of the queue.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the queue is empty or not.
*/


/*<--------------------------MAIN CODE--------------------------------------------->*/
public class CN_QueueUsingLL {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Queue queue = new Queue();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					queue.enqueue(input);
					break;

				case 2:
					System.out.println(queue.dequeue());
					break;

				case 3:
					System.out.println(queue.front());
					break;

				case 4:
					System.out.println(queue.getSize());
					break; 

				default: 
					System.out.println((queue.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}	
}
