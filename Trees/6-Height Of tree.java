import java.util.*;
public class BinaryTreeP {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static 	class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;	
		}
	}
	public static int heightOfTree(Node root) {
		//our base case is that if sometimes our become zero meaning
		//that it will reach leaf node then we will just return 0
		if(root==null) {
			return 0; 
		}
		//we will calculate height of left and right subtree and
		//check which has maximum height
		int LeftSubTree=heightOfTree(root.left);
		int RightSubTree=heightOfTree(root.right);
		int myHeight=Math.max(LeftSubTree, RightSubTree);
		
		return myHeight+1; //we added one to include root
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.println(heightOfTree(root));	
	}
}