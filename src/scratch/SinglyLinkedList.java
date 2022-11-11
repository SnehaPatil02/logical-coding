package scratch;

public class SinglyLinkedList {
	static Node head;
	int count;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	void display() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			count++;
			n = n.next;
		}

		System.out.println("No. of elements are : " +count);
	}
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.head = new Node(10);
//		Node second = new Node(23);
//		Node third = new Node(12);
		
		list.head.next =  new Node(23);
		list.head.next.next = new Node(12);
		
		list.display();

	}

}
