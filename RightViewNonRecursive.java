import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;
import java.util.LinkedHashMap;
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
	public void printRightView(Node node){
		if(node==null)
			return;
		int height = height(node);
		Queue<QItem> queue = new LinkedList<>();
		Map<Integer, Node> map = new LinkedHashMap<>();
		queue.add(new QItem(node, 1));
		while(!queue.isEmpty()){
			QItem q = queue.poll();
			Node temp = q.node;
			int level = q.level;
			map.put(level, temp);
			if(temp.left!=null){
				queue.add(new QItem(temp.left, level+1));
			}
			if(temp.right!=null){
				queue.add(new QItem(temp.right, level+1));
			}
		}

		for(Map.Entry<Integer, Node> entry: map.entrySet()){
			System.out.print(entry.getValue().value + " ");
		}
	}

	public int height(Node node){
		if(node==null)
			return 0;
		return 1+Math.max(height(node.left), height(node.right));
	}

}

class RightViewNonRecursive{
	public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        BinaryTree bt = new BinaryTree();
        bt.printRightView(root);
	}
}