package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		System.out.println(arr);
		
		ArrayList<String> str = new ArrayList<>();
		str.add("Ant");
		str.add("Bat");
		str.add("Car");
		str.add("Door");
		str.add("Euro");
		System.out.println(str);
		str.set(2, "Bus");
//		str.add(2, "Bus");
		System.out.println(str);
	}

}
