package collections;

import java.util.ArrayList;

public class Arraylist {
	void list1() {
	ArrayList<String> list=new ArrayList<>();
	list.add("List of Animals:");
	list.add("Dog");
	list.add("Cow");
	list.add(" ");
	list.add("cat");
	for(String str:list) {
	System.out.println(str);
	}}

	public static void main(String[] args) {
	
	Arraylist a=new Arraylist();
	 	a.list1();
	}

}
