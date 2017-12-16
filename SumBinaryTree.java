import java.util.Scanner;
class Node{
	public int value;
	public Node left;
	public Node right;

	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	public boolean isSumExists(Node node, int sum){
		
	}	
}

class SumBinaryTree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		Node root = new Node(10);
		root.left = new Node(16);
		root.right = new Node(5);
		root.left.right = new Node(-3);
		root.right.left = new Node(6);
		root.right.right = new Node(11);

		BinaryTree bt = new BinaryTree();
		System.out.println("Sum Value exists in Binary Tree : "+ bt.isSumExists(root, sum));
	}
}