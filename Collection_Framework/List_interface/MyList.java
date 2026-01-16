package list_interface;

public class MyList {

	public static void main(String[] args) {
		 
		My_LinkedList list = new My_LinkedList();
		
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		list.add(50);
		list.addL(20);
		list.display();
		
		System.out.println("*********************");
		
		list.remove(50);
		list.display();
	

	}

}

class My_LinkedList {
	 
	private Node head;
	
	// Node inner Class
	private static class Node {
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	// Adding Element At First
	public void add(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;
		head=newNode;
	}
	
	// Adding Element at End
	public void addL(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void remove(int value) {
		if(head == null);
		if(head.data == value) {
			head = head.next;
		}
		
		Node temp = head;
		while(temp.next != null && temp.next.data != value){
			temp = temp.next;
		}
		if(temp.next == null)
			return; // Not Found 
		
		temp.next = temp.next.next;
	}
	
	// Display the List
	public void display() {
		Node temp =head;
		
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		//System.out.println("Null");
	}
	
}