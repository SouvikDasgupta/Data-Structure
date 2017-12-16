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
	public void levelOrderTraversal(Node node){
		int height = getHeight(node);
		for(int i=height; i>=1;i--){
			printLevel(node, i);
			System.out.println();

		}
	}

	private int getHeight(Node node){
		if(node == null)
			return 0;
		return 1 + java.lang.Math.max(getHeight(node.left), getHeight(node.right));
	}

	private void printLevel(Node node, int level){
		if(node== null){
			return;
		}
		if(level == 1){
			System.out.print(node.value + " ");
		}else if(level > 1){
			printLevel(node.left, level-1);
			printLevel(node.right, level-1);
		}
	}
}

class LLLevelOrderTraversal{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(16);
		root.right = new Node(5);
		root.left.right = new Node(-3);
		root.right.left = new Node(6);
		root.right.right = new Node(11);
		new BinaryTree().levelOrderTraversal(root);
	}
}