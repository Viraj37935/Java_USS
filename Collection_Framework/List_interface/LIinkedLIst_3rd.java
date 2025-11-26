package list_interface;

public class LIinkedLIst_3rd {

	public static void main(String[] args) {
		 MyLinkedList list = new MyLinkedList();
		    list.add(10);
		    list.add(20);
		    list.add(30);
		    list.addFirst(5);

		    list.print(); 
		    
		    list.delete(20);
		    list.print();
	}

}

class MyLinkedList {
	private Node head;

	// Node inner Class
	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	// Insert at end
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//Insert at Beginning
	public void addFirst(int data) {
	    Node newNode = new Node(data);
	    newNode.next = head;
	    head = newNode;
	}
	
	// Delete Node by Value
	public void delete(int key) {
	    if (head == null) return;
	    if (head.data == key) {
	        head = head.next;
	        return;
	    }

	    Node temp = head;
	    while (temp.next != null && temp.next.data != key) {
	        temp = temp.next;
	    }
	    if (temp.next == null) return; // not found

	    temp.next = temp.next.next;
	}
	
	//Printing The node 
	public void print() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
	}
}