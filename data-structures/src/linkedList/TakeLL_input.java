package linkedList;

import java.util.Scanner;

public class TakeLL_input {
	
	static Scanner s = new Scanner(System.in);
	
	public static Node<Integer> takeip(){
		int data = s.nextInt();
		Node<Integer> head =null, tail = null;
		
		while (data != -1) {
			Node<Integer> currentNode = new Node<> (data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			} else {
				tail.next = currentNode; //connecting currentNode with last(previous) node
				tail = currentNode;	//incrementing tail
			}
			data = s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		while (head !=null) {
			System.out.print(head.data + " ");
			head= head.next;
		}
		
	} 
	public static Node<Integer> insert(Node<Integer> head,int element, int pos) {
		Node<Integer> temp = head, temp2 = head;
		int count =0;
		//when pos ==0;
		if(pos == 0) {
			temp = head;
			head = new Node<>(element);
			head.next = temp;
			return head;
		}
		Node<Integer> insertNode = new Node<>(element);
		while(count< pos) {
			if(count< pos-1){
				temp = temp.next;
			}
			count++;
			temp2 = temp2.next;
		}
		temp.next = insertNode;
		insertNode.next = temp2;
		
		return head;
	}
	
	public static void main(String [] args) {
		Node<Integer> head = takeip();
		Node<Integer> headFromInsert = insert(head, 12, 0);
		
		print(headFromInsert);
	}


}
