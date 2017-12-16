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
	public boolean isChildrenSumTree(Node node){
		if(node==null)
			return true;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			int left = 0;
			int right = 0;
			Node temp = queue.poll();
			if(temp.left == null && temp.right==null)
				continue;
			if(temp.left != null){
				left = temp.left.value;
				queue.add(temp.left);
			}
			if(temp.right != null){
				right = temp.right.value;
				queue.add(temp.right);
			}
			if((left+right) != temp.value){
				return false;
			}
		}
		return true;
	}
}

class ChildrenSumProperty{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		BinaryTree bt = new BinaryTree();
		System.out.println("Is a children Sum Tree:" + bt.isChildrenSumTree(root));
	}
}