package collectionframework.listinterface.linkedlist;

public class DLL {
	private Node head;
	private Node tail;
	private int size;
	
	public DLL() {
		this.size = size;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int val) {
			this.value = val;
		}
		public Node(int val, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
