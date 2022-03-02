package collections;

import java.util.LinkedHashSet;

public class Linkedhashset1 {

	public static void main(String[] args) {
		System.out.println("Linkedhashset");	
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add(null);
		set.add("hari");
		set.add("lata");
		set.add("ravi");
		for(String b:set) {
			System.out.println(b);
	}

}
}