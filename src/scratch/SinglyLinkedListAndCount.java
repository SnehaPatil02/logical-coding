package scratch;

public class SinglyLinkedListAndCount {
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
			while(head != null) {
				System.out.println(head.data );
				count++;
				head = head.next;
				
			}
			
			System.out.println("No.of elements : " +count);
		}
	
	
	public static void main(String[] args) {
		 
		SinglyLinkedListAndCount list = new SinglyLinkedListAndCount();
		
		list.head = new Node(32);
		list.head.next = new Node(43);
		list.head.next.next = new Node(22);
		
		list.display();
		

	}

}
