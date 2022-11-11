package Interview;

public class Graph {

	public static void main(String[] args) {
		Node node = new Node(23);
		//System.out.println(node.value);
			
		Node n1 = new Node();
		node.left =n1;
		n1.value = 26;
		
		Node n2 = new Node();
		n2.right = n2;
		n2.value = 30;
		
		Node n3 ;
		n3 = node;
		
		while(n3.left != null) {
			System.out.println("The graph traversal is :" +n3.value);
			n3=n3.left;
		}
		
				
		
	}

}