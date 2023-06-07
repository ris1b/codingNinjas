package linkedList;

public class Node<T>{
	/*this class will have 2 things :	(1) Data
	 * 									(2) Reference to the next Link
	 * What should be the type of reference? -->Next node will also be a node!
	 * So it will be of type Node			*/

	public T data;//it is the data of the node, type is generic
	public Node<T> next;//next has reference of next node-->so it's of type Node
	public Node(T data){
		this.data = data;
		//next = null;	//by default it is NULL
	}


}

/*
 *FOR IMPLEMENTING STACK USING LL, WE HAVE CHANGED THE VISIBILITY OF THE CONSTRUCTOR, NEXT NODE TO
 *AND DATA TO PUBLIC
 * */
 