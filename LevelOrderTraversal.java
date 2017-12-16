import java.util.Queue;
import java.util.LinkedList;
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
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			node = queue.poll();
			System.out.print(node.value + " ");
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
		}
	}

}

class LevelOrderTraversal{
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