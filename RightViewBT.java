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
	public void printRightView(Node node){
		if(node==null)
			return;
		System.out.print(node.value + " ");
		printRightView(node.right);
	}

}

class RightViewBT{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(8);
		root.right.right = new Node(3);
		root.right.right.right = new Node(12);
		BinaryTree bt = new BinaryTree();
		bt.printRightView(root);
	}
}