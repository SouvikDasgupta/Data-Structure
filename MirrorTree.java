import java.util.Stack;
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
	public Node mirror(Node node){
		if(node == null)
			return null;
		Node left = mirror(node.left);
		Node right = mirror(node.right);

		node.left = right;
		node.right = left;
		return node;
	}

	public void inorderTraversal(Node node){
		if(node == null)
			return;
		Stack<Node> stack = new Stack<>();
		while(true){
			if(node!=null){
				stack.push(node);
				node = node.left;
			}else{
				if(stack.isEmpty())
					break;
				Node n = stack.pop();
				System.out.print(n.value + " ");
				node = n.right;
			}
		}
	}
}

class MirrorTree{
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
		bt.inorderTraversal(root);
		System.out.println();
		Node mirror = bt.mirror(root);
		bt.inorderTraversal(mirror);

	}
}