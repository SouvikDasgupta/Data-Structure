class Node{
	public int value;
	public Node next;

	public Node(int value){
		this.value = value;
		this.next = null;
	}
}

class LinkedList{
	public boolean hasCycle(Node head){
		if(head == null)
			return false;
		Node fast = head.next;
		Node slow = head;
		while(fast != null && fast.next != null && slow != null){
			if(fast==slow)
				return true;
			fast = fast.next.next;
			slow = slow.next;
		}

		return false;
	}

}

class CyclicList{
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		// head.next.next.next.next.next = head.next.next;

		System.out.println("Is cyclic: - " + new LinkedList().hasCycle(head));

	}
}