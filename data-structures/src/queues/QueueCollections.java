package queues;

import java.util.Queue;
import java.util.LinkedList;

public class QueueCollections {

	public static void main(String[] args) {
		
//		Queue<Integer> queue = new Queue<Integer>(); //Queue is an Interface. We can't create an object of an interface.
//		Queue<Integer> queue; //We can create a reference of an interface
		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(10);
//		queue.add(20);
//		System.out.println(queue.size());
//		System.out.println(queue.poll());
//		System.out.println(queue.peek());
//		System.out.println(queue.size());
		 for(int i=1;i<5;i++)
	        {
	            queue.add(10+i);
	            queue.poll();
	            
	        }
	        System.out.print(queue.poll()+" "+queue.size());
	}

}
