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
		
		public void deleteLast() 
		{
			Node current = head;
			Node temp = head;
			while(current.next!=null) {
				temp = current;
				current= current.next;
			}
			current = temp;
			current.next = null;	
		}

		public void inserAfter(Node after,int d)
		{
			Node current = head;
			Node temp = head;
			while(temp.data != after.data)
			{
				temp = current;
				current = current.next;
			}
			Node n = new Node();
			n.data = d;
			temp.next = n;
			n.next = current;
		}
	}

	public class MyClass {
	public static void main(String[] args) {
	
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.insertLast(2);
		sl.insertLast(4);
		sl.inserFirst(3);
		sl.deleteLast();
		Node node = new Node();
		node.data =5;
		sl.inserAfter(node, 10);
		sl.printElement();
		if(sl.isEmpty()) {
			System.out.println("Lis is Empty");
		}
	}
}
