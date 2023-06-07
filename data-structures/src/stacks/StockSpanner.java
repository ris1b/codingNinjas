		/******IMPLEMENTING CLASS FOR STOCK SPAN****/
package stacks;
import java.util.Stack;
public class StockSpanner {
	/*
    We should have a stack of a pair of (current  price, maximum number of consecutive days)
    Since we don't have an access to the indicies.
	 */
	Stack<int []> s;	//Note Arrays are non-primitive data types.
	
	public StockSpanner() {
		this.s = new Stack<>();	//initializing object
	}
	
	public int next(int price) {
		int span = 1;
        while (!s.isEmpty() && price >= s.peek()[0]) {
        	span += s.peek()[1];
            s.pop();
        }
        s.push(new int[]{price, span});
        return span;
    }
/*link to discussion:
  https://leetcode.com/problems/online-stock-span/discuss/640358/JAVA-Solution-With-visualization-and-easy-explained!
  */
}
