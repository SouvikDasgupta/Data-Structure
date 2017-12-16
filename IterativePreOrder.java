import java.util.Stack;
class Node{
	public int value;
	public Node left;
	public Node right;

	public Node(int value){
		this.value =value;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	public void printPreOrderTraversal(Node node){
		if(node == null)
			return;
		Stack<Node> s1 = new Stack<>();
		s1.push(node);
		while(!s1.isEmpty()){
			node = s1.pop();
			System.out.print(node.value + " ");
			if(node.right != null)
				s1.push(node.right);
			if(node.left != null)
				s1.push(node.left);
		}
	}
}


class IterativePreOrder{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(19);
		root.left.left = new Node(2);
		root.left.right = new Node(11);
		root.right.left = new Node(-2);
		root.right.right = new Node(6);
		root.left.left.right = new Node(8);
		new BinaryTree().printPreOrderTraversal(root);
	}

}