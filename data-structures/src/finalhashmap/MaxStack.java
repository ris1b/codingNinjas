package finalhashmap;

import java.util.Stack;

public class MaxStack {
	Stack<Integer> stack;
	Stack<Integer> maxStack;

	public MaxStack() {
		stack = new Stack<>();
		maxStack = new Stack<>();
	}

	public void push(int x) {
		int max;
		if (maxStack.isEmpty())
			max = x;
		else
			max = maxStack.peek();

		if (x > max)
			maxStack.push(x);
		else
			maxStack.push(max);

		stack.push(x);

	}

	public int pop() {
		maxStack.pop();
		return stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int peekMax() {
		return maxStack.peek();
	}

	public int popMax() {

		int max = peekMax();
		Stack<Integer> temp = new Stack<>();
		while (top() != max) {
			temp.push(pop());
		}
		pop();
		while (!temp.isEmpty())
			push(temp.pop());
		return max;
	}
}
