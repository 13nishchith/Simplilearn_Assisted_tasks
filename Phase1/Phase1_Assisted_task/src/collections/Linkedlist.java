package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		System.out.println(" List of students in the class");
		LinkedList<String> c=new LinkedList<>();
		c.add("alex");
		c.add("siri");
		c.add("may");
		c.add("fitz");
		c.add("Daizy");
		for(String names:c)
		System.out.println(names);
		

	}

}
