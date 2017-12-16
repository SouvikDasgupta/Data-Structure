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
	public int countLeaf(Node node){
		if(node==null)
			return 0;
		if(node.left==null && node.right==null)
			return 1;
		return countLeaf(node.left) + countLeaf(node.right);
	}
}


class CountLeafNodes{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		// root.right.right = new Node(1);

		BinaryTree bt = new BinaryTree();
		System.out.println("Number of leaf nodes = " + bt.countLeaf(root));
	}
}