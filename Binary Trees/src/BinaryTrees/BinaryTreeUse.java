package BinaryTrees;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class PairOfNodeElement{
	/*Pair of two LL, [head, tail]*/
	Node<Integer> head;
	Node<Integer> tail;
}
class Node<T> {
	/*Node of my LinkedList*/
	T data;
	Node<T> next;
public Node(T data){
	this.data = data;
	}
}
public class BinaryTreeUse {
	
	static Scanner s = new Scanner(System.in);
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		//base case
		if(root == null) {
			return 0;
		}
		//calculate nodes in left sub tree
		int leftCount =  numNodes(root.left);
		int rightCount = numNodes(root.right);
		
		return leftCount + rightCount + 1;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data : ");
		} else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			} else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
		
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		int rootData = s.nextInt();	
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		
		//now attach left sub-tree and right sub-tree to the root
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		//Base Case
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + ":");
		//check if left and right of the root are not NULL
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right !=null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		//now call recursion on Left and Right
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
		
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		//Base Case
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	public static int largest(BinaryTreeNode<Integer> root) {
		//Base case
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftLargest = largest(root.left);
		int rightLargest = largest(root.right);
		
		return Math.max(root.data, Math.max(leftLargest, rightLargest));
		/*if(leftLargest>rightLargest) {
			max = leftLargest;
		} else {
			max = rightLargest;
		}
		if(root.data > max) {
			return root.data;
		}else {
			return max;
		}*/
	}
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null || root.right == null) {
			return 1;
		}
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	public static void printDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printDepthK(root.left, k-1);
		printDepthK(root.right, k-1);
	}
	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		//Base case
		if(root == null) {
			return null;
		}
		//Check if node is a leaf node or not
		if(root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		
		return root;
	}
	/*Check Balanced-Improved*/
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		//Base Case
		if(root == null) {
			int height = 0;
			boolean isBal = true;
			//Creating an object of BalancedTreeReturn type  
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		//We wont't be asking for just the leftHeight and rightHeight
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);//-->Now we have all the four info
		//We have the leftHeight and isLeftBalanced,rightHeight and isRightBalanced
		
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			//We can't return false, as our function is supposed to return height and isBalanced
			//which are wrapped inside an object
			isBal = false;
		}
		//else if this is not the case, we need to check whether left is balanced,right is balanced
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
		
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + Math.max(leftHeight,rightHeight);
		
	}
	/*Check if Binary Tree is balanced*/
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);	
		
		return isLeftBalanced && isRightBalanced;
	}
	
	/*Taking input level wise*/
//	static Scanner s = new Scanner(System.in);
	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		//here we have taken the root data
		
		if(rootData == -1) {
			return null;
			/*
			 * this is not a base case
			 * the user don't want to enter anything*/
		}
		
		/*We will create a root node and will give rootData ot it*/
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		/*We need to insert into Queue
		 * Because Queue is an interface, we need to use a class
		 * which implements this interface and we will use the
		 * Linked List class which implements Queue*/
		
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		/*What kind of Queue we need
		 *Queue is going to be of BinaryTreeNode type which is itself
		 *a BinaryTreeNode of Integer type as we want to attach the node
		 *to left or right and not the data*/
		
		/*Now we need to insert the root inside the Queue*/
		pendingChildren.add(root);	//right now our Q has just one element,say 1
									//we want to take out 1 & ask Left Right child of 1
									//once we get left right child we will add them back to queue
									//will keep doing this till the point Q is not empty
		while(!pendingChildren.isEmpty()) {
			//we want to take the first element out
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			//once we have front, we ask for it's left child
			System.out.println("Enter left child of " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			
			System.out.println("Enter right child of " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
		
	}
	
	/*Construct Tree Using Inorder and Preorder*/
	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]){
		BinaryTreeNode<Integer> root = buildTreeFromPreHelper(pre, in, 0, pre.length -1, 0, in.length);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeFromPreHelper(int pre[], int in[],int siPre,int eiPre,int siIn, int eiIn){
		//Base Case
		if(siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int rootIndex = -1;
		for(int i=siIn; i<=eiIn; i++) {
			if(in[i]== rootData) {
				rootIndex = i;
				break;
			}
		}
		//Assuming root is present in inOrder
		int siPreLeft = siPre + 1; //root + 1
		int siInLeft = siIn; //startIndex of Left
		int eiInLeft = rootIndex - 1;
		int siInRight = rootIndex  +1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;
		
		int leftSubTreeLength = eiInLeft - siInLeft + 1;
		
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
		int siPreRight = eiPreLeft + 1;
		
		BinaryTreeNode<Integer> left = buildTreeFromPreHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		BinaryTreeNode<Integer> right = buildTreeFromPreHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
		
		root.left = left;
		root.right = right;
		
		
		return root;
	}
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		//Base case:an empty tree is a BST
		if(root == null) {
			return true;
		}
		int leftMax = largest(root.left);
		if(leftMax >= root.data) {//everything left of root has to be less
			return false;
		}
		
		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}
		//Checking 3rd and 4th condition
		boolean isLeft = isBST(root.left);
		boolean isRight = isBST(root.right);
		return isLeft && isRight;
	}
	public static isBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		if(root == null) {
			isBSTReturn ans = new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		isBSTReturn leftBST = isBST2(root.left);
		isBSTReturn rightBST = isBST2(root.right);
		
		int min = Math.min(root.data, Math.min(leftBST.min, rightBST.min));//either root.data, or one of the minimum coming from left or right side
		int max = Math.max(root.data, Math.max(leftBST.max, rightBST.max));
		
		boolean isBST = true;
		if(leftBST.max >= root.data) { //--->max element in leftBST should be less root.data
			isBST = false;
		}
		if(rightBST.min < root.data){//->min element in rightBST should be greater than or equal root.data
			isBST = false;
		}
		if(!leftBST.isBST) {
			isBST = false;
		}
		if(!rightBST.isBST) {
			isBST = false;
		}
		isBSTReturn ans = new isBSTReturn(min, max, isBST);
		
		return ans;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root == null) return true;
		
		if(root.data < minRange || root.data > maxRange) {
			return false;
		}
		
		boolean isLeftWithinRange = isBST3(root.left, minRange, root.data - 1);
		boolean isRightWithinRange = isBST3(root.right, root.data, maxRange);
		
		return isLeftWithinRange && isRightWithinRange;
	}
	
	public static Node<Integer> constructLL(BinaryTreeNode<Integer> root){
		return constructLLHelper(root).head;
	}
	public static PairOfNodeElement constructLLHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			PairOfNodeElement pair = new PairOfNodeElement();
			return pair;
		}
		Node<Integer> newNode = new Node<Integer>(root.data);
		PairOfNodeElement leftList = constructLLHelper(root.left);
		PairOfNodeElement rightList = constructLLHelper(root.right);
		
		PairOfNodeElement pair = new PairOfNodeElement();
		
		if(leftList.tail != null) {
			leftList.tail.next = newNode;
		}
		newNode.next = rightList.head;
		
		if(leftList.head != null) {
			pair.head = leftList.head;
		} else {
			pair.head = newNode;
		}
		
		if(rightList.tail != null) {
			pair.tail = newNode;
		}
		return pair;
		
	}
	/*----------------------BST II----------------------*/
	/*Root to node path in BINARY TREE*/
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
		if(root == null) return null;
		
		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(x);
			return output;
		}
		ArrayList<Integer> leftSubTree = nodeToRootPath(root.left, x);
		if(leftSubTree != null) {			//we have found X
			leftSubTree.add(root.data);		//we will add root data to it
			return leftSubTree;
		}
		//In case we did not find X in Left side
		ArrayList<Integer> rightSubTree = nodeToRootPath(root.right, x);
		if(rightSubTree != null) {
			rightSubTree.add(root.data);
			return rightSubTree;
		}
		//In case we did not find X in right as well then we can return null
		return null;
	}
	public static void main(String[] args) {
		/*
		*
		//-->Creating a node, where data is 1
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		
		root.left = rootLeft;
		root.right = rootRight;
		
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
		
		rootLeft.right = twoRight;
		rootRight.left = threeLeft; 
		*
		*/
		
		/*--Taking Input part 1--*/
//		BinaryTreeNode<Integer> root = takeTreeInput();
//		printTree(root);
		
//		/*--Taking Input part 2--*/
//		/*Here we want to be specific in taking the input from the user*/
////		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0 , true);
//		BinaryTreeNode<Integer> root = takeInputLevelwise();
//		printTreeDetailed(root);
//		
//		/*To count number of nodes in a Binary Tree we call numnodes()*/
//		System.out.println("Num Nodes " + numNodes(root));
//		
//		/*To find Node with Largest data*/
//		System.out.println("Largest " + largest(root));
//		
//		/*To find the number of Leaves*/
//		System.out.println("Num leaves " + numLeaves(root));
//	
//		/*To print Nodes at Depth k*/
//		System.out.println("print at depth k ");
//		printDepthK(root, 2);
//		
//		/*To Remove Leaf node in a Tree*/
////		BinaryTreeNode<Integer> newNode = removeLeaves(root);
////		printTreeDetailed(newNode);
//		
//		/*To find whether the Binary Tree is balanced or not*/
////		System.out.println("is Balanced " + isBalanced(root));
//		/*isBalancedBetter TC: O(n)*/
//		System.out.println("is balanced better " + isBalancedBetter(root).isBalanced);	//-->it returns the object so we are printing the isBalanced part
		
		int in[]= {1,2,3,4,5,6,7};
		int pre[]= {4,2,1,3,6,5,7};
		BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
		printTreeDetailed(root);
		isBSTReturn ans = isBST2(root);
		System.out.println(ans.min + " " + ans.max + " " + ans.isBST);
		
		root = takeTreeInputBetter(true, 0, true);
		ArrayList<Integer> path = nodeToRootPath(root, 7);
		if(path == null) {
			System.out.println("Not Found");
		}else {
			for(int i : path) {
				System.out.println(i);
			}
		}
		System.out.println(path);
	}

}





























/**
 * Ternary Operator
 Java ternary operator is the only conditional operator that takes three operands. It’s a one-liner replacement
 for the if-then-else statement and is used a lot in Java programming. We can use the ternary operator in place of
 if-else conditions or even switch conditions using nested ternary operators. Although it follows the same algorithm
 as of if-else statement, the conditional operator takes less space and helps to write the if-else statements in the
 shortest way possible.


Syntax: 

variable = Expression1 ? Expression2: Expression3


If operates similarly to that of the if-else statement as in Exression2 is executed if Expression1 is true else
Expression3 is executed.  

if(Expression1)
{
    variable = Expression2;
}
else
{
    variable = Expression3;
}


// Java program to find largest among two
// numbers using ternary operator

import java.io.*;

class Ternary {
	public static void main(String[] args)
	{

		// variable declaration
		int n1 = 5, n2 = 10, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2; //if n1 > n2 then max = n1 ELSE max = n2

		// Print the largest number
		System.out.println("Maximum is = " + max);
	}
}


Output
First num: 5
Second num: 10
Maximum is = 10
 
 */





































