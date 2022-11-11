package scratch;


public class SinglyLinkedListAndReverse {
	static Node head;
	
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}

//	void reverse(Node current) {
//		if(head == null) {
//			System.out.println("The list is empty");
//			
//		}
//		else {
//			if(current.next == null) {
//				System.out.println(current.data + " ");
//				return;
//			}
//			reverse(current.next);
//			System.out.println(current.data + " ");
//		}
//	}
	
	void deleteFromStart() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			if(head != head.next) {
			}
			else {
				head = head.next = null;
			}
			
		}
	}
	
	void display() {
		while(head != null) {
			System.out.println(head.data );
			head = head.next;
	}
	}
	
	public static void main(String[] args) {
		SinglyLinkedListAndReverse list = new SinglyLinkedListAndReverse();
		
		list.head = new Node(32);
		list.head.next = new Node(43);
		list.head.next.next = new Node(22);
		
		System.out.println("The Original list :");
		list.display();
		
		System.out.println("After deleting list :");
		list.deleteFromStart();

	}

}
