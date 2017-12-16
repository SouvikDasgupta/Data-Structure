import java.util.Scanner;
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

class BinarySearchTree{
	int count = 0;
	int index = 0;
	public void inorderTraversal(Node node, int index, int[] seq){
		this.index = index;
		if(node == null)
			return;
		inorderTraversal(node.left, this.index, seq);
		if(node.value == seq[this.index]){
			System.out.println("index value :- " + this.index);
			this.index++;
			count++;
		}
		inorderTraversal(node.right, this.index, seq);
	}

	public int getCount(){
		return count;
	}

}

class SortedSubSeqBst{
	public static void main(String[] args){
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);
		BinarySearchTree bst = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] seq = new int[size];
		for(int i=0; i<size; i++){
			seq[i] = sc.nextInt();
		}
		bst.inorderTraversal(root, 0, seq);
		if(bst.getCount() == seq.length){
			System.out.println("Exists");
		}else{
			System.out.println("Dont Exists");
		}

	}
}