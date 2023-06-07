package linkedList;

import java.util.Scanner;

class DoubleNode{
/*wrapping references of head and tail in this class*/
	 Node<Integer> head;
	 Node<Integer> tail;
	 DoubleNode(){}
	 
	 DoubleNode(Node<Integer> head, Node<Integer> tail){
		 this.head = head;
		 this.tail = tail;
	 }
} //*****end of DoubleNode class



public class LinkedListUse {
	
/*at bottom look at cn quest for clarity*/
	public static Node<Integer> createLinkedList() {//This function creates a linked list and returns linked list to us
		Node<Integer> n1 = new Node<Integer>(10);	//creating Node 1
		Node<Integer> n2 = new Node<Integer>(20);	//node 2
		Node<Integer> n3 = new Node<Integer>(-1);	//node 3
//		Node<Integer> n4 = new Node<Integer>(40);	//node 4
		
		n1.next =n2;	//Connecting the Nodes
//		System.out.println("n1 " + n1 + " data " + n1.data + " next " + n1.next);
		n2.next = n3;
//		System.out.println("n2 " + n2 + " data " + n2.data + " next " + n2.next);
//		n3.next =n4;
//		System.out.println("n3 " + n3 + " data " + n3.data + " next " + n3.next);
//		System.out.println("n4 " + n4 + " data " + n4.data + " next " + n4.next);
//		n4.next = null;	
		
		return n1;
	}

	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static void print(Node<Integer> head) {
		while (head !=null) {
			System.out.print(head.data + " ");
			head= head.next;
		}
//		System.out.println(head.data);
//		System.out.println(head);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
//		System.out.println(head.next.next.next.data);
		
	} 
	
	public static int length(Node<Integer> head){
		//Your code goes here
        // 3 4 5 2 6 1 9 -1
		int len = 0;
        Node<Integer> temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
	}
	static Scanner s = new Scanner(System.in);
	
	public static Node<Integer> takeInput() {
		//O(n^2)
		int data = s.nextInt();
		Node<Integer> head = null;
		
		while(data != -1) { //will take i/p till != -1
			Node<Integer> currentNode = new Node<> (data);
			if(head == null) {
				head = currentNode;
			} else {
				Node<Integer> tail = head;
				while(tail.next != null) {//WE KEEP ON MOVING TILL TAIL.NEXT!=NULL
					tail = tail.next;
				}
				//Now tail will refer to last node
				//Connect current node after last node
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void printRecursive(Node<Integer> head) {
		if(head == null) {
			return;
		}
//		System.out.println(head.data + " recursive ");
		printRecursive(head.next);
		System.out.print(head.data + " ");
	}
	
	public static Node<Integer> reverseR(Node<Integer> head){
		//----> O(n^2)
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> smallHead = reverseR(head.next);
		Node<Integer> tail = smallHead;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallHead;
	}
	
	public static DoubleNode reverseRBetter(Node<Integer> head) {	//1-2-3-4
		//----> O(n)
		DoubleNode ans = null;
		if(head == null || head.next == null) {
			ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		//This double node will have both head and tail of reversed linked list !
		DoubleNode smallAns = reverseRBetter(head.next);	//1-4-3-2
		smallAns.tail.next = head;	//4-3-2-1-still point to 2
		head.next = null;	//4-3-2-1-Null
		ans = new DoubleNode();	
		ans.head= smallAns.head;	//i.e 4
		ans.tail = head; // i.e. 1

		return ans;
	}
	public static Node<Integer> reverseRBetter1(Node<Integer> head){
		DoubleNode ans = reverseRBetter(head);
		return ans.head;
	}
	
	public static Node<Integer> reverseRBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> smallHead = reverseRBest(head.next);
		Node<Integer> reversedTail = head.next;
		reversedTail.next = head;
		head.next = null;
		
		return smallHead;
	}
	/*
	 * 
Stack data structure can be implemented using linked list
New node can only be added at the top of the stack
Stack is the FIFO data structure
New node can be added at both ends*/
	
	public static Node<Integer> reverseIterative(Node<Integer> head){
		Node<Integer> prev = null, next = null;
		Node<Integer> current = head;
		if(current == null || current.next == null) {
			return head;
		}
		while(current!= null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
		return head;
	}
	public static void main(String [] arg) {
//		Node<Integer> head =createLinkedList();
//		increment(head);
//		print(head);
//		int len=length(head);
//		System.out.println(len);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
//		Node<Integer> head = takeInput();
//		print(head);
//		printRecursive(head);
		
//		Node<Integer> head =takeInput();
//		head = reverseR(head);
//		print(head);
		
//		Node<Integer> head =takeInput();
//		head = reverseRBetter1(head);
//		print(head);
		
//		Node<Integer> head =takeInput();
//		head = reverseRBest(head);
//		print(head);
		
//		Node<Integer> head =takeInput();
//		head = reverseIterative(head);
//		print(head);
		

	}

}












/*
public class Node<T> {
	  T data;
	  Node<T> next;
	  Node(T data){
	    this.data = data;
	  }
	}
public  class LinkedListUse{

	 public static void print(Node<Integer> head){
	    Node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void main(String args[]){

	    Node<Integer> node1 = new Node<Integer>(10);
	    Node<Integer> node2 = new Node<Integer>(20);
	    node2.next = node1;
	    print(node2);
	   }
	}
	o/p--> 20 10
	*/

/*
public class Node<T> {
	  T data;
	  Node<T> next;
	  Node(T data){
	    this.data = data;
	  }
	}
public  class LinkedListUse{
	 public static void print(Node<Integer> head){
	    Node<Integer> temp = head;

	    while(temp != null){
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	public static void main(String args[]){

	    Node<Integer> node1 = new Node<Integer>(10);
	    Node<Integer> node2 = new Node<Integer>(20);
	    node1.next = node2;
	    increment(node1);
	    print(node1);
	   }
	}
	op--> 11 21
	*/