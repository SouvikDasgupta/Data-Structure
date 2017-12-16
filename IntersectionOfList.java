class LinkedList{
	public int value;
	public LinkedList next;
	public LinkedList(int value){
		this.value = value;
		this.next = null;
	}
}

class ListIntersectionCheck{
	public LinkedList getIntersectedNode(LinkedList head1, LinkedList head2){
		int length1 = getCount(head1);
		int length2 = getCount(head2);
		int diff = 0;
		if(length1>length2){
			diff = length1-length2;
			return getNode(diff, head1, head2);
		}else{
			diff = length2-length1;
			return getNode(diff, head2, head1);
		}
	}

	public LinkedList getNode(int diff, LinkedList pri, LinkedList sec){
		int i =0;
		while(i<diff){
			pri = pri.next;
			i++;
		}
		while(pri!=null && sec!=null){
			if(pri.value == sec.value){
				return pri;
			}
			pri = pri.next;
			sec = sec.next;
		}
		return null;

	}

	public int getCount(LinkedList head){
		int count = 0;
		while(head!=null){
			count++;
			head = head.next;
		}
		return count;
	}

}
class IntersectionOfList{
	public static void main(String[] args){
		LinkedList head1 = new LinkedList(3);
		head1.next = new LinkedList(6);
		head1.next.next = new LinkedList(9);
		head1.next.next.next = new LinkedList(15);
		head1.next.next.next.next = new LinkedList(30);

		LinkedList head2 = new LinkedList(10);
		head2.next = new LinkedList(15);
		head2.next.next = new LinkedList(30);
		ListIntersectionCheck lic = new ListIntersectionCheck();
		LinkedList intersectedNode = lic.getIntersectedNode(head1, head2);
		if(intersectedNode!=null){
			System.out.println(intersectedNode.value);
		}else{
			System.out.println("No node ");
		}
	}
}