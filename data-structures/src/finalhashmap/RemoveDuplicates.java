package finalhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
	public static ArrayList<Integer> removeDuplicates(int [] arr){
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> op = new ArrayList<Integer>();
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> setA=new HashSet<>();
		
		
		set.contains(0); 
		set.equals(setA);
		for(int item : arr) {
			if(map.containsKey(item)) {
				continue;
			}
			map.put(item, true);
			op.add(item);
		}
		return op;
	}
	
	public static void main(String [] arg) {
		int a[] = {90,3,2,2,3,1,6,2,5};
		ArrayList<Integer> output = removeDuplicates(a);
		System.out.println(output);
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(a[0] , 2332);
		map.put(a[1] , 1);
		map.put(a[2] , 1);
		map.put(a[3] , 1);
		map.put(a[4] , 1);
		map.put(a[5] , 1);
		
	}

}
