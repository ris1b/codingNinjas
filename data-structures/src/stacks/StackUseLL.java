package stacks;

public class StackUseLL {
	public static void main(String [] args) throws StackEmptyException{
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		int arr[]= {5,6,7,1,9};
		
		for(int i=0; i< arr.length; i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	

}
