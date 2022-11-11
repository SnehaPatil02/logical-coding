package Interview;

public class ReversingLinkedList {
	
	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		node = prev;
		return node;
	}
	
	void printList(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReversingLinkedList ll = new ReversingLinkedList();
		ll.head = new Node(50);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(10);
		
		System.out.println("Given linked list " );
				ll.printList(head);
				head = ll.reverse(head);
				System.out.println(" ");
				System.out.println("Reversed linkedlist ");
				ll.printList(head);
	}
}
