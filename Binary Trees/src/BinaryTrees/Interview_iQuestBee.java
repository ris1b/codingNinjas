package BinaryTrees;
//import java.util.ArrayList;
public class Interview_iQuestBee {
	/*
	 WAP in JAVA Take Dyamic array as:
Input- 234,4567,121,03,98989,230




After Reverse -432,7654,121,30,98989,032



Final Output- 9,22,4,3,43,5



9,22,4,30,43,5 
	 * */

	//function to take in a number and reverse it
	private static void reverse(int arr[]) {
		for(int i=0;i<arr.length; i++) {
			int x = arr[i];
			arr[i] = revDigits(x);
		}
	}
	//	{234,4567,121,03,98989,230};
	//function to reverse every digit of number
	private static int revDigits(int num) {
		int a = countDigits(num) -1;
		int ans = 0;
		while(num > 0) {
			ans += (num%10) * Math.pow(10, a);
			num = num/10;
			a--;
		}
		return ans;
	}
	//function to count num of digits
	private static int countDigits(int a) {
		int count =0;
		while(a > 0) {
			count++;
			a /=10;
		}
		return count;
	}
	//function to take in a number and replace by it's sum
	private static void sum(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			int x = arr[i];
			arr[i] = getSum(x);
		}
	}
	//function to get sum
	private static int getSum(int num) {
		int ans = 0;
		while(num > 0) {
			ans += num%10;
			num /=10;
		}
		return ans;
	}

	public static void main(String [] arg) {
		int arr []= {234,4567,121,03,98989,230};

		reverse(arr);
		System.out.println("Reverses array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Array of sum : ");
		sum(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}








/*
		 --> every element i have to do repeated operation
		 	function which takes in a number and reverses it
		 	in a for loop, i'll send the numbers one-by-one and
		 	get the reverse digits number---> put it in the list  
		 		take all the nums from the input
		 		input[i] = f2(input[i]);
 */
//		for(int i=0;i<arr.length; i++) {
//			int count = countDigits(arr[i]);
//			int temp = 0;
//			while(arr[i] > 0) {
//				temp += (arr[i] % 10) * Math.pow(10,count-1);
//				arr[i] = arr[i] / 10;
//				count--;
//			}
//			arr[i] = temp;
//		}
//		for(int item : arr) {
//			System.out.print(item + " ");
//		}
//		for(int i=0;i<arr.length; i++) {
//			int count = countDigits(arr[i]);
//			int temp = 0;
//			while(arr[i] > 0) {
//				temp += (arr[i] % 10) * Math.pow(10,count-1);
//				arr[i] = arr[i] / 10;
//				count--;
//			}
//			arr[i] = temp;
//		}

