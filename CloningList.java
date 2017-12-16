import java.util.Map;
import java.util.LinkedHashMap;
class Node{
	public int value;
	public Node next;
	public Node random;

	public Node(int value){
		this.value = value;
		this.next = null;
		this.random = null;
	}
}

class LinkedList{
	public void clone(Node head){
		Node original = head;
		Node cloned = null;
		Map<Node, Node> map = new LinkedHashMap<Node, Node>();
		while(original!=null){
			cloned = new Node(original.value);
			map.put(original, cloned);
			original = original.next;
		}

		original = head;
		while(original!=null){
			cloned = map.get(original);
			cloned.next = map.get(original.next);
			cloned.random = map.get(original.random);
			original = original.next;
		}
		for(Map.Entry<Node, Node> entry: map.entrySet()){
			System.out.println(entry.getValue().value + ", " + entry.getValue().random.value);
		}
	}

	public void print(Node node){
		Node temp = node;
		while(temp!=null){
			Node random = temp.random;
			int randomData = (random!=null)?random.value:-1;
			System.out.println(temp.value +", " + randomData);
			temp = temp.next;
		}
	}
}

class CloningList{
	public static void main(String[] args){
		Node head = new Node(5);
		head.next = new Node(6);
		head.next.next = new Node(7);
		head.next.next.next = new Node(8);
		head.next.next.next.next = new Node(9);

		head.random = head.next.next.next;
		head.next.random = head.next.next.next.next;
		head.next.next.random = head.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head;
		System.out.println("Original List");

		LinkedList list = new LinkedList();
		list.print(head);
		System.out.println("Cloned List");
		list.clone(head);
	}
}