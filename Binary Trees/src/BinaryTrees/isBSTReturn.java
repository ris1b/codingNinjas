package BinaryTrees;

public class isBSTReturn {
	int min;	//min value in subtree
	int max;	//max value in subtree
	boolean isBST;//is the subtree balanced 
	
	public isBSTReturn(int min, int max, boolean isBST) {
		this.min = min;
		this.max = max;
		this.isBST = isBST;
	}

}
