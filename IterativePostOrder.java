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
	public void postOrder(Node node){
		if(node==null)
			return;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(node);
		while(!s1.isEmpty()){
			node = s1.pop();
			s2.push(node);
			if(node.left!=null){
				s1.push(node.left);
			}
			if(node.right!=null){
				s1.push(node.right);
			}
		}

		while(!s2.isEmpty()){
			node = s2.pop();
			System.out.print(node.value + " ");
		}
	}
}
class IterativePostOrder{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(-10);
		root.right = new Node(11);
		root.left.right = new Node(5);
		root.left.right.right = new Node(3);
		root.right.left = new Node(13);
		root.right.right = new Node(16);
		new BinaryTree().postOrder(root);
	}
}