package oops;

class cal{
	void add() {
		System.out.println("hii");
	}

	}
class cal1 extends cal{
	 void add() {
		 System.out.println("heee");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal c=new cal1();
		c.add();


	}

}
