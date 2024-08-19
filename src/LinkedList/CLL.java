package LinkedList;


//circular linked list



public class CLL {
	
	private Node head, tail;
	
	
	public CLL() {
		super();
		this.head = null;
		this.tail = null;
	}


	public class Node{
		int val;
		Node next;
		
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

//	inserting
	
	public void insert(int val) {
		
	Node node = new Node(val);
	
	if(head == null) {
		head = node;
		tail = node;
	}
	
	tail.next = node;
	node.next = head;
	tail = node;
	
	}
	
//	display
	public void display() {
		Node node = head;
		
		
		if(head != null) {
			do {
				System.out.print(node.val + " -> ");
				node = node.next;
			}while(node != head);
		}
	}
	
//	deleting
	public void delete(int val) {
		Node node = head;
		
		if(node == null) {
			return;
		}
		
		
		if(node.val == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		
		do {
			Node n = node.next;
			if(n.val == val) {
				node.next = n.next;
				break;
			}
			node = node.next;
		}while(node != head);
		
	}
	
	
	
	public static void main(String[] args) {
		CLL list = new CLL();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.delete(1);
		list.display();
	}
	

}
