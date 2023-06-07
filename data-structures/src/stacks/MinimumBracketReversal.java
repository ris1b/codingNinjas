package stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumBracketReversal {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int countBracketReversals(String input) {
		//Your code goes here
Stack<Character> stack = new Stack<>();
        
        //Firsr check if String length is odd or even
        //if odd we can't balance
        if(input.length() % 2 !=0){
            return -1;
        }
        int count = 0;
        int i=0;
        while(!stack.isEmpty()){
            if(input.charAt(i) == '{'){
                stack.push(input.charAt(i));
            }
            else if(input.charAt(i) == '}')
            {
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();		//BALANCING
                    count = count+1;
                } else if(stack.isEmpty()){
                    stack.push( input.charAt(i) );
                } else if(!stack.isEmpty() && stack.peek() != '{'){
                    stack.push( input.charAt(i) );
                }
                i++;
            }
        } //end of while loop-->travered the whole String
        
        while(!stack.isEmpty())
        {
            char c1 = stack.peek();
            stack.pop();
            char c2 = stack.peek();
            stack.pop();
            if(c1 == '{' && c2=='{'){
                count++;
            } else if(c1 == '{' && c2 == '}'){
                count+=2;
            }
        }

        return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println(countBracketReversals(br.readLine().trim()));

	}
}
