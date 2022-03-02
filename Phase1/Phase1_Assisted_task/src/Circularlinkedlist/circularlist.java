package Circularlinkedlist;


public class circularlist {
	class Node{
		int data;
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
			newNode.next=head;
		}else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("list is empty");
		}
		System.out.println("Nodes of doubly linked list:");
		while(current!=null) {
			System.out.println(current.data+"");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		circularlist clist=new circularlist();
		clist.addNode(1);
		clist.addNode(2);
		clist.addNode(3);
		clist.addNode(4);
		clist.addNode(5);
		clist.display();
		
	}


}
