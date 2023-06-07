package finalhashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {
	public static void main(String [] arg) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//insert
		map.put("abc", 1);
		map.put("def", 3);
		
		//To check whether abc has key or not
		if(map.containsKey("abc")) {
			System.out.println("Map has abc");
		}
		
		//get value
		int v = map.get("abc");	//will get value corresponding to the Key
		System.out.println(v);
		
		/*int v1 = map.get("abc1");
		System.out.println(v1); //--> Throws NULL pointer exception */
		int v1= 0;
		if(map.containsKey("abc1")) {
			v1 = map.get("abc1");
		}
		System.out.println(v1);
		
		//Remove function
		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("Map has abc");
		}
		//iterate
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.println(s);
		
		}
		System.out.println(map.containsKey("abc"));
	}
}










