package singlyLinkedListImplementation;

	 class Node {
		
		public int data;
		public Node next;	
		
		public void printData()
		{
				System.out.println(data+">>");
		}
	}
	
	 class SinglyLinkedList {
		private Node head;
		
		public boolean isEmpty() {
			return (head==null);
		}
		public void inserFirst(int d)
		{
			// creating a new node
			Node n = new Node();
			//assign argument d to this new node
			n.data = d;
			// linked this newly added node to LINKEDLIST by 
			//giving its next address to existing head
			n.next = head;
			//make newly added node as Head
			head = n;
		}
		
		public Node deleteFirst()
		{
			head= head.next; 
			return head;	
		}
		
		public void printElement()
		{
			Node current = head;
			while(current!=null) {
				current.printData();
				current= current.next;
			}
		}
		
		public void insertLast(int d)
		{
			Node n = new Node();
			n.data= d;
			n.next = null;
				Node current = head;
				if(head!=null) {
				while(current.next!=null) {
					current= current.next;
				}
				current.next = n;
			}else {
				head = n;
			}
		}
		
		public Node deleteLast() 
		{
			Node current = head;
			while(current.next!=null) {
				current= current.next;
			}
			current = null;
			return head;
		}
	}

	public class MyClass {
	public static void main(String[] args) {
	
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.insertLast(2);
		sl.insertLast(4);
		sl.inserFirst(3);
		sl.deleteLast();
		
		sl.printElement();
		if(sl.isEmpty()) {
			System.out.println("Lis is Empty");
		}
	}
}
