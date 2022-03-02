package collections;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("hi ");
		queue.add("welcome to ");
		queue.add("this");
		queue.remove("this ");
		//priority queue do not all null 
		//queue.add(null);
		
		for(String s:queue) {
			System.out.println(s);
		}
		

	}

}
