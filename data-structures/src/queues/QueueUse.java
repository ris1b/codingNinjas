package queues;

public class QueueUse {
	
	public static void main(String [] arg){
		/*Below is Queue LinkedList use case*/
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();		
		/*Below is Queue Array use case*/
//		QueueUsingArray queue = new QueueUsingArray(3);	//Creating Queue with size=3

		int arr[] = {10,20,30,40,50};
		for(int elem : arr) {
//			try {
				queue.enqueue(elem);
//			} catch (QueueFullException e) {
//				
//			}
		}
		while(! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
		
	}

}
