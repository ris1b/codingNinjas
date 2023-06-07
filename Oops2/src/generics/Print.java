package generics;

public class Print {
	public static<T extends Vehicle> void printArray(T [] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
//			System.out.println(arr[i]);
		}
	}
	public static void main(String [] args) {
//		/*int*/ Integer arr[] = new /*int*/ Integer[5];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i + 1;
//		}
//		printArray(arr);
//		System.out.println();
//		String arrS[] = new String[5];
//		for(int i=0; i<arrS.length; i++) {
//			arrS[i] = "abc";
//		}
//		printArray(arrS);
//		System.out.println();
//		Vehicle v = new Vehicle();
/*Below we have created a Vehicle array.*/		
		Vehicle v[] = new Vehicle[5];//it creates an array of Vehicle references
									//every Reference is supposed to point to a Vehicle Object
		for(int i=0; i<v.length; i++) {
			v[i] = new Vehicle(10*i, "abc");
		}
		printArray(v);
	}

}
