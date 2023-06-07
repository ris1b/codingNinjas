package classesandobjects;

public class DynamicArray {

	private int nextElementIndex;	//keep track of where next element should go.
	private int data[];	//we have created a reference, and not an array here.
	/*
	 * We have created an array internally and we would keep this array private
	 * as this is for our internal use only & we don't want anyone to access it.
	 * If someone wants to insert element to array or do some operation in array, then
	 * they will do via class objects only.
	 */
	
	public DynamicArray() {
		data = new int[5];		//this creates a new array internally.
		nextElementIndex = 0;
	}
	
	public int size() {		//returns the size of the array
		return nextElementIndex;
//		return data.length;		//this is not correct, as data is an array that we are internally maintaining to
		//store eelements && it does not keep track of no. of elements that have been inserted.
	}
	
	public boolean isEmpty() {
		return nextElementIndex == 0; //if nextElementIndex is 0, then returns true.
	}
	
	public int get(int i) { 	//when user want to know what is the index at element 'i'
		if(i >= nextElementIndex) {
			//Throw Error
			return -1;
		}
		return data[i];
	}
	
	public void add2 (int i, int elem) {
		if(nextElementIndex == data.length) {
			doubleCapacity();		//i.e. when our array is full , we want to double it's size/ capacity. So will call doubleCapacity function.
		}
		for(int j=nextElementIndex; j>i; j--) {
			data[j]=data[j-1];
		}
		data[i] = elem;
		nextElementIndex ++;
	}
	
	public void add(int elem) {
		if(nextElementIndex == data.length) {
			doubleCapacity();		//i.e. when our array is full , we want to double it's size/ capacity. So will call doubleCapacity function.
		}
		data[nextElementIndex] = elem;
		nextElementIndex ++;
	}

	private void doubleCapacity() {	//Private- because we do't allow anyone to change the capacity of array, until we want it.
		//storing the reference of the first(i.e. previous) array before creating a new array of double size
		int temp[] = data;
		data = new int [2 * temp.length];		//now data will point to a new array
		for(int i=0;i<temp.length;i++) {		//copying elements into new array from previous array
			data[i] = temp[i];
		}
	}
	
	public void set(int i, int elem) {
		if(i >= nextElementIndex) {
			//Throws error
			return;		//we can only replace an element before nextElementIndex
						//if it's not a valid index, we won't set the value
		}
		data[i] = elem;
	}
	
	public int removeLast(){	//it removes the last element from the array, it will return the element that is removed &will remove last element
		if (nextElementIndex ==0) { //check, if the array is non-empty
			return -1;
		}
		int temp = data [nextElementIndex - 1];
		//data [nextElementIndex - 1] = 0; we can avoid doing it, as the next element will override this element any-way 
		nextElementIndex --;
		return temp;
	}
	
	public int removeElement(int i) {
		if (nextElementIndex ==0) { //check, if the array is non-empty
			return -1;
		}
		int temp=data[i];
		for(int j=i; j<nextElementIndex -1;j++) {
			data[j] = data[j+1];
		} nextElementIndex --;
		return temp;
	}
	
}
