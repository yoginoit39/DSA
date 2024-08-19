package LinkedList;

public class DLL {
	
	private Node head,tail;
	
	
	
	public class Node{
		private int val;
		private Node next;
		private Node prev;
	
		
		public Node (int val) {
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		
		}
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		
		if(head != null) {
			head.prev = node;
		}	
		head = node;	
	}
	
	
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " <-> ");
			temp = temp.next;
		}
		System.out.print("END");
	}
	
	public void insertLT(int val) {
		
		Node last = head;
		
		if(head == null) {
			head.prev = null;
			head = last;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
		
		Node node = new Node(val);
		node.next = null;
		last.next = node;
		node.prev = last;
		last = node;
		
	
		
		
	}
	
//	insert at an index
	public void insertIndex(int val, int index) {
		
		if(index == 0) {
			insertFirst(val);
			return;
		}
		
		Node temp = head;
		
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val, temp.next);
		temp.next = node;
		
		
		
	}
	
//	insert a node after the node that has been given to you 
	
//	first you have to find the node. creating a find function
	
	public Node find(int value) {
		
		Node node = head;
		
		while(node != null) {
			if(node.val == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public void insertAfter(int after, int val) {
		Node p = find(after);
		
		if(p == null) {
			System.out.println("Node does not exist");
			return;
		}
		
		Node node = new Node(val);
		
		node.next = p.next;
		p.next = node;
		node.prev = p;
		
		if(p.next != null) {
			p.next.prev = node;
		}		
	}
	
	
	
	
	
	
	
	
	public static void main (String[] args) {
		DLL list = new DLL();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertLT(200);
		list.insertIndex(300,2);
		list.insertAfter(6, 7);
		
		
		list.display();
	}
	

}
