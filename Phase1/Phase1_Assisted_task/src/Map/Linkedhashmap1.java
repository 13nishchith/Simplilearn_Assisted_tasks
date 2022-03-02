package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linkedhashmap1 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hash=new LinkedHashMap<>();
		hash.put("hari",1255);
		hash.put("niki",1202);
		hash.put("cunni",1456);
		hash.put("suman",1564);
		for(Entry<String,Integer> a:hash.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
			
		}
		

	}

}
