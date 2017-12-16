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
	public void printInorderTraversal(Node node){
		if(node == null)
			return;
		Stack<Node> s1 = new Stack<>();
		while(true){
			if(node != null){
				s1.push(node);
				node = node.left;
			}else{
				if(s1.isEmpty())
					break;
				node = s1.pop();
				System.out.print(node.value + " ");
				node = node.right;
			}
		}
	}
}

class IterativeInorder{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(0);
		root.right = new Node(-10);
		root.left.left = new Node(5);
		root.left.right = new Node(6);
		root.right.right = new Node(11);
		new BinaryTree().printInorderTraversal(root);
	}
}