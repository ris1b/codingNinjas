package priorityqueue;

import java.util.ArrayList;


public class Priority_Queue<T> {
	/*will have an arrayList of Element, can be of T type*/
	private ArrayList<Element<T>> heap;			//we will visualize it as Heap.
	
	public Priority_Queue(){
		this.heap = new ArrayList<>();
		//Here will initialize our Priority Queue
	}
	
	public void insert(T value, int priority) {	//To insert into PQ,give Value,Priority
		//upHeapify
		Element<T> e = new Element<>(value, priority);
		heap.add(e);		//we are inserting an element with (val,priority) into heap
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex-1)/2;
		while(childIndex > 0){
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				//Then we Swap.
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				//After swapping, new childIndex becomes
				childIndex = parentIndex;				//i.e the old parentIndex
				parentIndex = (childIndex-1)/2;
			}else {
				return;		//when child's priority greater than parentIndex priority
							//we don't need to move upwards
			}
		}
	}
	
	public T getMin() throws PriorityQueuesException{
		if(isEmpty()) {
			throw new PriorityQueuesException();
		}
		return heap.get(0).value;
	}
	
	public T removeMin() throws PriorityQueuesException{
		if(isEmpty()) {
			throw new PriorityQueuesException();
		}
		Element<T> removed = heap.get(0);	//the element that need to be removed
		T ans = removed.value;
		heap.set(0,  (heap.get(heap.size()-1)));
		heap.remove(heap.size()-1);
		//moved last element to 0th position & removed at last position
		
		//downHeapify-->
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;
		
		while(leftChildIndex < heap.size()) {
			int minIndex= parentIndex;
			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
				minIndex = rightChildIndex;
			}
			if(minIndex == parentIndex) {
				break;
			}
			Element<T> temp = heap.get(minIndex);		
			heap.set(minIndex, heap.get(parentIndex));	//30 in place of 10
			heap.set(parentIndex, temp);				//10 in place of 30
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex+1;
			rightChildIndex = 2*parentIndex+2;
		}
		return ans;
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
//		return heap.isEmpty(); --> done by Rishabh
	}

}
