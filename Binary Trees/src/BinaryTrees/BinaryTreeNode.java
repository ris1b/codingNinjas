package BinaryTrees;

public class BinaryTreeNode<T> {
	T data;						//data of the node
	BinaryTreeNode<T> left;		//left node
	BinaryTreeNode<T> right;	//right node
	
	//Creating a constructor to take data as input and set the data
	public BinaryTreeNode(T data) {
		this.data = data;
	}
	

}
