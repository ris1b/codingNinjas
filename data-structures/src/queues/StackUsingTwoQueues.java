package queues;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Stack {

    //Define the data members
	Queue<Integer> q1;
	Queue<Integer> q2;
	int size;

    public Stack() {
        //Implement the Constructor
    	q1 = new LinkedList<>();
		q2 = new LinkedList<>();
    	size = 0;
    	
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
    	return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    	return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
    	q1.add(element);
    }

    public int pop() {
        //Implement the pop() function
    	while(q1.size()>1) {
			q2.add(q1.poll());
		}
		int temp = q1.poll();
		Queue<Integer> ts = q1;
		q1 = q2;
		q2 = ts;
		return temp;
    }

    public int top() {
        //Implement the top() function
    	while(q1.size()>1) {
			q2.add(q1.poll());
		}
		int temp = q1.peek();
		q2.add(q1.poll());
		Queue<Integer> ts = q1;
		q1 = q2;
		q2 = ts;
		
		return temp;
    }
}

public class StackUsingTwoQueues {
	
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Stack stack = new Stack();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					stack.push(input);
					break;

				case 2:
					System.out.println(stack.pop());
					break;

				case 3:
					System.out.println(stack.top());
					break;

				case 4:
					System.out.println(stack.getSize());
					break; 

				default: 
					System.out.println((stack.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
