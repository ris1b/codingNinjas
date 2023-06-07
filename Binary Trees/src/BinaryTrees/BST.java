package BinaryTrees;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	/*Check is root is present*/
	public boolean isPresent(int x){
		return isPresent(root, x);
	}
	private boolean isPresent(BinaryTreeNode<Integer> node, int x) {
		//base case
		if(node == null) {
			return false;
		}
		if(node.data == x) {
			return true;
		}
		if(x < node.data) {
			return isPresent(node.left, x);
		}else {
			return isPresent(node.right, x);
		}
	}/*---*/
	
	public void insert(int x) {
		root = insert(root, x);
		size++;
	}
	private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> node, int x){
		if(node == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x);
			return newNode;
		}
		if(x >= node.data) {
			node.right = insert(node.right, x);
		} else {
			node.left = insert(node.left, x);
		}
		return node;
	}/*---*/
	private static int minimum(BinaryTreeNode<Integer> root) {
		//Base case
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);
		
		return Math.min(root.data, Math.min(minLeft, minRight));
	}
	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			BSTDeleteReturn output = new BSTDeleteReturn(null, false);
			return output;
		}
		
		if(root.data < x) {									//x is present on the Right Side
			BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		if(root.data > x) {									//x is present on the Right Side
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft;
		}
		
		// 0 children
		if(root.data == x) {
			if(root.left == null && root.right == null){
				return new BSTDeleteReturn(null, true);		//true-->We have deleted
			}
		}
		// only left child
		if(root.left !=null && root.right == null) {
			return new BSTDeleteReturn(root.left, false);			//We will return that left child
		}
		
		// only right child
		if(root.left == null && root.right != null) {
			return new BSTDeleteReturn(root.right, false);
		}
		
		// both children are present
		int rightMin = minimum(root.right);			//to find minimum, will call largest on right side
		root.data = rightMin;						//root data will become Y
		BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
													 //we know Y is already present on right side,
													//so will delete rightMax i.e. Y from right side
		root.right = outputRight.root;
		return new BSTDeleteReturn(root, true);
	}	
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root, x);
		root = output.root; 						//potentially the root has changed
		if(output.deleted) {
			size--;									//when something is deleted
		}
		return output.deleted; 						//tell whether something is delted ot not
	}
	public int size(){
		return size;
	}
	public void printTree() {
		printTree(root);
	}
	private static void printTree(BinaryTreeNode<Integer> node) {
		//Base Case
		if(node == null) {
			return;
		}

		System.out.print(node.data + ":");
		//check if left and right of the root are not NULL
		if(node.left != null) {
			System.out.print("L" + node.left.data + ",");
		}
		if(node.right !=null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();

		//now call recursion on Left and Right
		printTree(node.left);
		printTree(node.right);
	}
}