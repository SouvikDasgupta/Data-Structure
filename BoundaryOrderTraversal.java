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
	public void printBoundaryOrderTraversal(Node node){
		if(node==null)
			return;
		printLeftView(node);
		printLeafNodes(node);
		printRightView(node.right);

	}

	public void printLeftView(Node node){
		if(node==null)
			return;
		if(node.left != null && node.right!=null){
			System.out.print(node.value +" ");
		}
		printLeftView(node.left);

	}

	public void printLeafNodes(Node node){
		if(node == null)
			return;
		if(node.left == null && node.right == null){
			System.out.print(node.value +" ");
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
		

	}

	public void printRightView(Node node){
		if(node == null)
			return;
		printRightView(node.right);
		if(node.left != null && node.right!=null){
			System.out.print(node.value +" ");
		}
	}

}

class BoundaryOrderTraversal{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(8);
		root.right.right = new Node(3);
		root.right.right.left = new Node(11);
		root.right.right.right = new Node(12);
		BinaryTree bt = new BinaryTree();
		bt.printBoundaryOrderTraversal(root);
	}
}