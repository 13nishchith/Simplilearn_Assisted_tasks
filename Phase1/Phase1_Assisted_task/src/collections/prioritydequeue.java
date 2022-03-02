package collections;

import java.util.ArrayDeque;

public class prioritydequeue {
	public static void main(String[] args) { 
	ArrayDeque<Integer> a=new ArrayDeque<>();
	a.add(1);
	a.add(2);
	a.add(4);
	a.add(5);
	//ArrayDeque do not accepts null value
	a.add(null);
	for(Integer i:a) {
		System.out.println(i);
	}
	}
	

}
