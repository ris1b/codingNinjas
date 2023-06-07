package classesandobjects;

public class DynamicArrayUse {
	
	public static void main(String [] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i=1; i<100; i++) {	//for now we are inserting 100 elements to ensure we never run out of capacity
			d.add(100 + i);		//inserts new elements at the end
		}
		
		d.add2(1, 555);
		System.out.println(d.get(1));
		
		System.out.println(d.removeElement(1));
		
		System.out.println(d.size()); //d.size() gives the count of elements user has inserted 
		System.out.println(d.get(98));	// if you want to read a value, say, at arr[2], then we can use d.get() 
		d.set(3,170);		//it replaces the previous value with the current value.
		System.out.println(d.get(3));
		
		while(!d.isEmpty()) {	//tells whether dynamic array is empty or not, return true or false
			System.out.println(d.removeLast());		//it remove the last element of the array & will tell which was the
			System.out.println("size - " +d.size());//last element, now the sie of array will decrease by 1.
		}
	}
	
	

}
