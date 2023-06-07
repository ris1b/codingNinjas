package linkedList;
import java.util.Scanner;
public class InsertNodeLL {
	/*public static Node<Integer> insert(Node<Integer> head, int elem, int pos){
		Node<Integer> nodeTOBeInserted = new Node<Integer>(elem);
		if(pos == 0) {
			nodeTOBeInserted.next = head;
			return nodeTOBeInserted;
		} else {
			int count =0;
			Node<Integer> prev = head;
			while(count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if(prev != null) {
				nodeTOBeInserted.next = prev.next;
				prev.next = nodeTOBeInserted;
			}
			return head;
		}
	}*/
	
	public static Node<Integer> insertRec(Node<Integer> head, int elem, int pos){
		if(pos == 0) {
			Node<Integer> temp = head;
			Node<Integer> current = new Node<> (elem);
			current.next = temp;
			head = current;
			return head;
		}
		if(pos == 1) {
			Node<Integer> temp = head;
			Node<Integer> current = new Node<> (elem);
			temp = head.next;
			head.next = current;
			current.next = temp;
			return head;
		}
		Node<Integer> collect = insertRec(head.next, elem, pos-1);
		head.next = collect;
		return head;
	}
	
	public static Node<Integer> insertR(Node<Integer> head, int elem, int pos){
		if(head ==null && pos > 0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> current =new Node<>(elem);
			current.next = head;
			return current;
		}else {
			Node<Integer> smallerHead = insertR(head.next, elem, pos -1);
			head.next = smallerHead;
			return head;
		}
		
	}
	public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }
        int op [] = new int [count];
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                op[k] = nums[i];
                k++;
            }
        }
        nums = op;
 
        return count;
    }
	
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
	
	public static void main(String [] args) {
		Node<Integer> head = takeip();
		head = insertR(head, 20, s.nextInt());
		LinkedListUse.print(head);
		
		
		}
	}
