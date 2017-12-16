import java.util.Queue;
import java.util.LinkedList;
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
	public int hd;

	public QItem(Node node, int hd){
		this.node = node;
		this.hd = hd;
	}
}

class BinaryTree{
	public void printTopView(Node node){
		if(node==null)
			return;
		Queue<QItem> queue = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();
		queue.add(new QItem(node, 0));
		while(!queue.isEmpty()){
			QItem qItem = queue.poll();
			Node temp = qItem.node;
			int hd = qItem.hd;
			if(!set.contains(hd)){
				set.add(hd);
				System.out.print(temp.value + " ");
			}
			if(temp.left!=null){
				queue.add(new QItem(temp.left, hd-1));
			}
			if(temp.right!=null){
				queue.add(new QItem(temp.right, hd+1));
			}
		}

	}

}

class TopView{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.printTopView(root);
	}
}