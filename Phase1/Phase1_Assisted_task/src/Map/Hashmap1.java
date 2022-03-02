package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer,String> hash=new HashMap<>();
		hash.put(101, "adhi");
		hash.put(102, "ravi");
		hash.put(103, "abhi");
		hash.put(104, "manju");
		hash.put(null, " ");
		for(Entry<Integer, String> n:hash.entrySet()) {
			System.out.println(n.getKey()+"  "+n.getValue());
			
		}
	}

}
