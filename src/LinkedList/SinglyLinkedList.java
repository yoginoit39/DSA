package LinkedList;

public class SinglyLinkedList {
	
	private Node head, tail;
	private int size;
	
	public SinglyLinkedList() {
		this.size = 0;
	}
	
	public class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size += 1;
	}
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
		} else {
			Node node = new Node(val);
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	public void insertAtIndex(int val, int index) {
		if(index == 0) {
			insertFirst(val);
			return;
		}
		
		if(index == size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		
		for(int i = 1; i < index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		size--;
		return val;	
	}
	
	public Node get(int index) {
		Node node = head;
		
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}
	
	public int deleteFromIndex(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		
		if(index == size - 1) {
			return deleteLast();
		} 
		
		Node prev = get(index - 1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		return val;
	}
	
	
	
	public Node findNode(int value) {
		Node node = head;
		
		while(node != null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		return node;
	}
	
	
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	
	
//	insert using recursion
	
	
	
	
	
	public static void main (String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertLast(0);
		list.display();
		System.out.println("delete first item: " + list.deleteFirst());
		list.display();
		System.out.println("deleted last item: " + list.deleteLast());
		list.display();
		System.out.println("deleted index: " + list.deleteFromIndex(2));
		list.display();
		
		
		System.out.println("found node: " + list.findNode(1));
		list.display();
	}
}
