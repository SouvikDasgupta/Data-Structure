import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Node{
	public int value;
	public Node left;
	public Node right;

	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = right;
	}
}
class BinarySearchTree{
	List<Integer> list = new ArrayList<>();
	public void inorderTraversal(Node node){
		if(node == null)
			return;
		inorderTraversal(node.left);
		list.add(node.value);
		inorderTraversal(node.right);
	}
	public List<Integer> getList(){
		return list;
	}
}

class KthSmallestBst{
	public static void main(String[] args){
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		int k = new Scanner(System.in).nextInt();
		BinarySearchTree bst = new BinarySearchTree();
		bst.inorderTraversal(root);
		System.out.println(k + " Smallest Element of BST is:- " + bst.getList().get(k-1));
	}
}