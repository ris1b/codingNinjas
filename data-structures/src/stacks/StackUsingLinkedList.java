package stacks;

import linkedList.Node; // <---- imported the Node class which we created

public class StackUsingLinkedList <T>{
	
	private Node<T> head;
//	private Node<T> tail;
	private int size;
	
	public StackUsingLinkedList() {
		head=null;
		size = 0;
//		tail = null;
	}
	
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size ==0;
	}
	
	/*Here we maintained a Head and kept adding elements to the end
	 * public void push(T elem){
		Node<T> current = new Node<T>(elem);
		if(head == null) {
			head = current;
			tail = current;
			size++;
		} else {
			tail.next =current;
			tail = tail.next;
			size++;
		}
	}*/
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	/*Approach 1
	 * public T pop() {
		Node<T> temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
		return temp.data;
	}*/
	//-> Alternate approach
	public T pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public T top() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
}





