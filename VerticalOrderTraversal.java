import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

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
	public void printVerticalOrderTraversal(Node node){
		if(node==null)
			return;
		Queue<Node> queue = new LinkedList<>();
		Queue<Integer> hd = new LinkedList<>();
		queue.add(node);
		hd.add(0);
		ArrayList<Node> list = new ArrayList<>();
		list.add(node);
		Map<Integer, ArrayList<Node>> map = new TreeMap<>();
		map.put(0, list);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			int thd = hd.poll();
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
				queue.add(temp.left);
				hd.add(minhd);
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
				queue.add(temp.right);
				hd.add(maxhd);
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

class VerticalOrderTraversal{
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