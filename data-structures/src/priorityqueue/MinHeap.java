package priorityqueue;
import java.util.*;
/*This is implementation of min. Heap class*/
public class MinHeap {
	ArrayList<Integer> min;
	private int size;
	public MinHeap(ArrayList<Integer> arr) {
		this.min = arr;     // Inplace Heap
		this.size = arr.size();
		construct();        // construct the heap
	}
	public void construct() {
		int n = size;
		// starting from the Last Non-Leaf Node.
		for(int i=(n/2)-1; i>=0; i--) {
			downHeapify(i, n);
		}
	}

	public int size() {     // return the size of the heap
		return size;
	}
	public void insert(int newVal) {        // insertion takes log n time
		min.add(newVal);
		size++;
		upHeapify();
	}

	public int getMin() {       // EXTRACTS the minimum element from heap
		if(size == 0) return -1;
		int minVal = min.get(0);
		// Swap
		int temp = min.get(0);
		int rightChild = min.get(size-1); 
		min.set(0, rightChild);
//		min.set(size-1, temp);
		//		min.remove(min.size()-1); don't delete, rather size--;
		size--;
		// downheapify
		downHeapify(0, min.size());
		return minVal;
	}

	public void upHeapify(){
		int n = size;
		int child = n-1;
		while(child != 0) {
			int parent = (child-1)/2;
			if(min.get(parent) > min.get(child)) {
				int temp = min.get(parent);
				min.set(parent, min.get(child));
				min.set(child, temp);
				child = parent;
			} else {
				break;
			}
		}
	}

	public void downHeapify(int index, int n) {
		while((2*index)+1 < n) {
			int minVal = findMin(index, 2*index+1, 2*index+2);

			if(minVal == min.get(index)) {
				break;
			}
			else if(minVal == min.get(2*index+1)) {
				// Swap
				int temp = min.get(index);
				int leftChild = min.get(2*index+1); 
				min.set(index, leftChild);
				min.set(2*index+1, temp);
				index = 2*index+1;
			}
			else {
				// Swap
				int temp = min.get(index);
				int rightChild = min.get(2*index+2); 
				min.set(index, rightChild);
				min.set(2*index+2, temp);
				index = 2*index+2;
			}
		}

	}
	private int findMin(int index, int i, int j) {
		// returns the minimum
		int parent = min.get(index);
		int leftChild = min.get(i);
		int rightChild = Integer.MAX_VALUE;
		if(j < size) {
			rightChild = min.get(j);
		}

		return Math.min(parent, Math.min(leftChild, rightChild));
	}

	/////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(25);
		arr.add(16);
		arr.add(11);
		arr.add(31);
		arr.add(28);
		arr.add(20);
		arr.add(3);
		arr.add(8);
		int n = arr.size();
		System.out.println(n + " "  + 0);
		MinHeap min = new MinHeap(arr);
		System.out.println(n + " "  + min.size);
		for(int i=0; i<n; i++) {
			int m = min.getMin();
			arr.set(n-i-1, m);
		}

		System.out.println(arr + " "  + min.size);
		System.out.println(n + " "  + min.size);
	}

}
