package priorityqueue;

public class PriorityQueueTest {

	public static void main(String[] args) throws PriorityQueuesException{
		Priority_Queue<String> pq = new Priority_Queue<>();
		
		pq.insert("abc", 15);
		pq.insert("def", 13);
		pq.insert("ghi", 90);
		pq.insert("ijkl", 150);
		pq.insert("oihf", 120);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
		
	}

}
