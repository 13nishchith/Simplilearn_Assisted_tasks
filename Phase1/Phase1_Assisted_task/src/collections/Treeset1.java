package collections;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		System.out.println("tree set elements");
		TreeSet<Integer> set=new TreeSet <>();
		set.add(1);
		set.add(2);
		// null not accepts
		//set.add(null);
		set.add(40);
		for(Integer i:set) {
			System.out.println(i);
		}
	}

}
