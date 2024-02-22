package collectionframework.listinterface.linkedlist;

public class LL {

	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	private class Node {
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
	
	public void insertFirst(int value) {
		Node node = new Node(value); // creating a new node
		node.next = head; // initially head = null so node.next = null because no next node
		head = node; // head always points to the first node

		if (tail == null) { // means its a first element 
			tail = head;
		}
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null ) {
			tail = null;
		}
		size--;
		return val;
	}
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	public void insert(int val, int index) {
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
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size - 2);
		System.out.println("last" + secondLast.value);
		
		int val = tail.value;
		//System.out.println(val);
		tail = secondLast;
		tail.next = null;
		return val;
	}
	
	public Node find(int val) {
		Node node = head;
		while(node != null) {
			if(node.value == val) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void size() {
		System.out.println(size);
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size - 1) {
			return deleteLast();
		}
		Node prev = get(index - 1);
		int val = prev.next.value;
		
		//to break change
		prev.next = prev.next.next;
		
		return val;
	}
}
