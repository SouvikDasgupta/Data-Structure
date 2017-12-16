import java.util.*;
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

class QItem{
	public Node node;
	public int hd;

	public QItem(Node node, int hd){
		this.node = node;
		this.hd = hd;
	}


}

class BinaryTree{
	public void printVerticalOrderTraversal(Node node){
		if(node==null)
			return;
		Queue<QItem> queue = new LinkedList<QItem>();
		Map<Integer, ArrayList<Node>> map = new TreeMap<>();
		ArrayList<Node> list = new ArrayList<>();
		queue.add(new QItem(node, 0));
		list.add(node);
		map.put(0, list);
		while(!queue.isEmpty()){
			QItem q = queue.poll();
			Node temp = q.node;
			int thd = q.hd;
			if(temp.left!=null){
				int minhd = thd-1;
				if(map.containsKey(minhd)){
					ArrayList<Node> l = map.get(minhd);
					l.add(temp.left);
					map.put(minhd, l);
				}else{
					ArrayList<Node> l = new ArrayList<>();
					l.add(temp.left);
					map.put(minhd, l);
				}
				queue.add(new QItem(temp.left, minhd));
			}

			if(temp.right!=null){
				int maxhd = thd+1;
				if(map.containsKey(maxhd)){
					ArrayList<Node> l = map.get(maxhd);
					l.add(temp.right);
					map.put(maxhd, l);
				}else{
					ArrayList<Node> l = new ArrayList<>();
					l.add(temp.right);
					map.put(maxhd, l);
				}
				queue.add(new QItem(temp.right, maxhd));
			}
		}

		for(Map.Entry<Integer, ArrayList<Node>> entry : map.entrySet()){
			for(Node n : entry.getValue()){
				System.out.print(n.value + " ");
			}
			System.out.println();
		}
	}

}

class RevVerticalOrderTraversal{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(6);
		root.left.right = new Node(7);
		root.right.left = new Node(5);
		root.right.right = new Node(3);
		BinaryTree bt = new BinaryTree();
		bt.printVerticalOrderTraversal(root);
	}
}