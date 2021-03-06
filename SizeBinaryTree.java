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
	public int getSize(Node node){
		if (node == null)
			return 0;
		return 1 + getSize(node.left) + getSize(node.right);
	}
}

class SizeBinaryTree{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(5);
		root.right.right = new Node(3);

		BinaryTree bt = new BinaryTree();
		System.out.println("Size of binary tree is: "+ bt.getSize(root));
	}
}