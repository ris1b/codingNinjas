package stacks;
//import java.util.*;
import java.util.Stack;

public class StackCollections {
	
	public static void main(String[] arg) {
//		Stack<Integer> stack=new Stack<Integer>();
//        while(stack.isEmpty())
//        {
//            stack.push(10);
//        }
//        System.out.print(stack.pop()+" "+stack.size());
		
//		Stack<Integer> stack = new Stack<>();
		Stack<Character> stk = new Stack<>();
//		String s="[{(";
//		char ch=s.charAt(1);
//		char c2 = '}';
//		System.out.println(c2 - ch);
		
		String s = "[{()})";
		if(s.length() % 2 != 0) {
			System.out.println("false");
		}
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stk.push(s.charAt(i));
			}
			else{
				//when char is ']' '}' ')' then check with top of stack
				if(stk.isEmpty())
				{
					System.out.println("stack is empty, FALSE");
				}
					else if(s.charAt(i) - 2 == stk.peek() || s.charAt(i) - 1 == stk.peek())
					{
						System.out.println("balanced, next");
						stk.pop();
					}
					else
					{
						System.out.println("not balanced & return false");
						
					}
				}

		}
		
//		int arr[] = {5,6,7,1,9};
//		
//		for(int elem : arr) {
//			stack.push(elem);
//		}
//		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
//		
//		stack.push(10);
//		stack.empty();
//		stack.peek();
//		stack.pop();
//		stack.size();

	}
	

}
