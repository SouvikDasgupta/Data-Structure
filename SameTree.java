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

	public boolean sameTree(Node root1, Node root2){
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		return (root1.value == root2.value) && sameTree(root1.left, root2.left) && sameTree(root1.right, root2.right);
	}

}

class SameTree{
	public static void main(String[] args){
		Node root1 = new Node(10);
		root1.left = new Node(16);
		root1.right = new Node(15);
		root1.right.left = new Node(18);

		Node root2 = new Node(10);
		root2.left = new Node(16);
		root2.right = new Node(15);
		root2.right.left = new Node(18);
		BinaryTree bt = new BinaryTree();
		System.out.println(bt.sameTree(root1, root2));


	}
}