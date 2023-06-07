package trees;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class TreeTest {
	static Scanner s = new Scanner(System.in);
	public static TreeNode<Integer> takeTreeLevelInput(){
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.poll();
			System.out.println("Enter number of children of " + front.data);
			int numChild = s.nextInt();
			for(int i=0; i<numChild; i++) {
				System.out.println("Enter the " + i + "th child of " + front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				front.children.add(childNode);
				pendingNodes.add(childNode);
			}
			
		}
		return root;
		
	}
	public static int numNodes(TreeNode<Integer> root) {
		//Special case
		if(root == null) return 0;
		
		int count = 1;
		for(int i=0; i<root.children.size(); i++) {
			int childCount = numNodes(root.children.get(i));
			count += childCount;
		}
		return count;
	}
	public static void printTree2(TreeNode<Integer> root) {
		//Special case
		if(root == null) return;
		
		System.out.print(root.data + ": ");
		for(int i=0; i< root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree2(child);
		}
	}
	public static void printTree(TreeNode<Integer> root) {
		//Special Case
		if(root == null) return;
		
		System.out.print(root.data + " ");
		for(int i=0; i<root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);	//recursive call
		}
	}
	
	public static void main(String[] args) {
		/*
		TreeNode<Integer> root = new TreeNode<Integer>(4);
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(1);
		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		
		node2.children.add(node4);
		node2.children.add(node5);
		
//		printTree(root);
		printTree2(root);
		System.out.println(numNodes(root));
		*/
		TreeNode<Integer> root = takeTreeLevelInput();
		printTree2(root);
		
	}

}
