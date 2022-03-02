package Doublylinkedlist;

public class doublylinkedlist {
	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			head.previous=null;
			tail.next=null;
		}else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			tail.next=null;
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("list is empty");
		return;
		}
		System.out.println("Nodes of doubly linked list:");
		while(current!=null) {
			System.out.println(current.data+"");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		doublylinkedlist dlist=new doublylinkedlist();
		dlist.addNode(1);
		dlist.addNode(2);
		dlist.addNode(3);
		dlist.addNode(4);
		dlist.addNode(5);
		dlist.display();
	}
}
