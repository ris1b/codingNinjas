package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class AllNodesDistanceK {
	//******************Solution from leetcode
	
	List<Integer> ans;
	boolean found;

	//Helper Method to count the element post the target node found
	private void getElement(BinaryTreeNode<Integer> root, int k){
		solution(root, null, k);
	}

	public List<Integer> distanceK(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k) {
		found = false;
		ans = new ArrayList<>();
		//Base case when the required level is itself then 
		//no need to search. Just return the element.

		if(k == 0){
			ans.add(target.data);
			return ans;
		}

		solution(root, target, k);
		return ans;
	}

	private int solution(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k){

		//base case to terminate search if reached null node
		//or not required to search because ans level bypassed .
		if(k == -1 || root == null)
			return -1;

		//Adding element in list when reached required level.
		if(k == 0){
			ans.add(root.data);
			return k;
		}
		//Marking when node found.
		if(root == target)
			found = true;
		if(found){
			int left = solution(root.left, null, k-1);
			int right = solution(root.right, null, k-1);
			return k-1;
		} else{
			int left = -1, right = -1;
			left = solution(root.left, target, k);
				if(left == -1){
				if(found)
					return -1;
				right = solution(root.right, target, k);
			}else{
				if(left == 0){
					ans.add(root.data);
					return -1;
				}
				getElement(root.right, left-1);
				return left-1;
			}
			if(right == -1)
				return -1;
			else{

				if(right == 0){
					ans.add(root.data);
					return -1;
				}
				getElement(root.left, right-1);
				return right-1;
			}
		}
	}

}
