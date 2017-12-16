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

class BinarySearchTree{
	public boolean isBST(Node node , int min, int max){
		if(node == null){
			return true;
		}
		if(node.value <= min || node.value > max){
			return false;
		}
		return isBST(node.left, min, node.value) && isBST(node.right, node.value, max);
	}
}

class IsBst{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(10);
		root.right = new Node(19);
		root.left.left = new Node(-5);
		root.right.left = new Node(17);
		root.right.right = new Node(21);

		System.out.println("Is a binary tree : "+ new BinarySearchTree().isBST(root, Integer.MIN_VALUE
			, Integer.MAX_VALUE));
	}

}