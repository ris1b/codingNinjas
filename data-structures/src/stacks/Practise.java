//package stacks;
//
//import java.util.LinkedList;
//
//class Stack<T>{
//	private LinkedList<Integer> front;
//
//	public Stack(T data){
//		this.front = new LinkedList<>();
//	}
//	public void push(int x){
//		if(front == null){
//			LinkedList<Integer> curr = new LinkedList<>();
//			curr.data = x;
//			front = curr;
//			size++;
//		}else{
//			LinkedList<Integer> curr = new LinkedList<>(x);
//			curr.next = front;
//			front = curr;
//			size++;
//		}
//	}
//	public void pop(){
//		if(front == null){
//			return;
//		}
//		front = front.next;
//		size--;
//	}
//
//	public void top(){
//		int x = front.data;
//		return x;
//	}
//
//	public boolean isEmpty(){
//		return front == null;
//	}
//}
//public class Practise {
//	Stack<Integer> stack1 = new Stack<>();
//	Stack<Integer> minStack = new Stack<>();
//	public void push(int x) {
//		stack1.push(x);
//		if(minStack.isEmpty()){
//			minStack.push(x);
//		} else{
//			int min = Math.min(x, minStack.top());
//			minStack.push(min);
//		}
//	}
//
//	public void pop() {
//		if(stack1.isEmpty()){
//			return;
//		}
//		stack1.pop();
//		minStack.pop();
//	}
//
//	public int top() {
//		if(stack1.isEmpty()){
//			return -1;
//		}
//		int x = stack1.top();
//		return x;
//
//	}
//
//	public int getMin() {
//		if(minStack.isEmpty()){
//			return -1;
//		}
//		int x = minStack.top();
//		return x;
//	}
//
//}
