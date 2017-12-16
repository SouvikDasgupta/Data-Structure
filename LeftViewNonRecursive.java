import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
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
class QItem{
	public Node node;
	public int level;
	public QItem(Node node, int level){
		this.node = node;
		this.level = level;
	}
}
class BinaryTree{
	public void printLeftView(Node node){
		if(node==null)
			return;
		int h = height(node);
		Queue<QItem> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<Integer>();
		queue.add(new QItem(node, 1));
		while(!queue.isEmpty()){
			QItem q = queue.poll();
			Node temp = q.node;
			int level = q.level;
			if(!set.contains(level)){
				set.add(level);
				System.out.print(temp.value + " ");
			}

			if(temp.left!=null){
				queue.add(new QItem(temp.left, level+1));
			}
			if(temp.right!=null){
				queue.add(new QItem(temp.right, level+1));
			}
		}

	}

	public int height(Node node){
		if(node==null)
			return 0;
		return 1 + java.lang.Math.max(height(node.left), height(node.right));
	}

}

class LeftViewNonRecursive{
	public static void main(String[] args){
		Node root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(2);
		root.right.left = new Node(3);
		root.right.right = new Node(1);
		root.right.left.left = new Node(6);
		root.right.left.right = new Node(7);
		root.right.left.left.left = new Node(8);

		BinaryTree bt = new BinaryTree();
		bt.printLeftView(root);
	}
}