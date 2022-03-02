package Singlylinkedlist;

public class singlylinkedlist {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data,Node next) {
			this.data=data;
			next=null;
		}
	}
	//inserting node to a linked list
	public static singlylinkedlist insert(singlylinkedlist list, int data ) {
		Node new_node=new Node(data, head);
		if(list.head == null) {
			list.head=new_node;
		}else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		
		return null;
	}
	//printing linked list
	public static void printlist(singlylinkedlist list) {
		Node curr_node=list.head;
		while(curr_node!=null) {
			System.out.println(curr_node.data+"");
			curr_node=curr_node.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlylinkedlist list=new singlylinkedlist();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 5);

		list.insert(list, 9);
		list.insert(list, 3);
		list.insert(list, 4);
		list.printlist(list);
	}

}
