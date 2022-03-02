package collections;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of salary of deposited for customers");
		Vector<Integer> v=new Vector<>();
		v.add(15000);
		v.add(16500);
		v.add(16550);
		v.add(15050);	
		v.add(15500);
		v.add(null);
		for(Integer itn:v)
		System.out.println(itn);
		
	}

}
