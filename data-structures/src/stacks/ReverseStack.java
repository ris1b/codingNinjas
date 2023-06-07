package stacks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class ReverseStack {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if(input.isEmpty()){
            return;
        }
        int temp = input.peek();
        input.pop();
        reverseStack(input,extra);
        extra.push(temp);
         while(!extra.isEmpty()){
        	 int top = extra.peek();
             input.push(top);
//             System.out.println(input.peek());
             extra.pop();	
         }
	}

    public static Stack<Integer> takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	Stack<Integer> input = new Stack<>();

    	if (size == 0) {
    		return input;
    	}
    	
    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input.push(Integer.parseInt(values[i]));
    	}

    	return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	Stack<Integer> input = takeInput();
    	Stack<Integer> empty = new Stack<>();

    	reverseStack(input, empty);

    	while(!input.isEmpty()) {
    		System.out.print(input.pop() + " ");
    	}
    	
    }

}
