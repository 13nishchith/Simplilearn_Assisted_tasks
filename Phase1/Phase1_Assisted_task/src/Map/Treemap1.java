package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		TreeMap<String,Integer> hash=new TreeMap<>();
		hash.put("haritha",1255);
		hash.put("nikitah",1202);
		hash.put("cunni",1456);
		hash.put("samantha",1564);
		for(Entry<String,Integer> a:hash.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
			
		}
	}

}
