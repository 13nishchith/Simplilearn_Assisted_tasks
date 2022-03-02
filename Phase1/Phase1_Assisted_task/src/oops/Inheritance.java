package oops;

class animal{
	void walk() {
		System.out.println("walking...");
	}
	
}
class dog extends animal {
	void walk() {
		System.out.println("barking...");
	}
}
class babydog extends dog {
	void walk() {
		System.out.println("plays...");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog bark=new dog();
		bark.walk();
		bark.walk();
		animal a=new animal();
		a.walk();
		a.walk();
		babydog b=new babydog();
		b.walk();
		
	}

}
