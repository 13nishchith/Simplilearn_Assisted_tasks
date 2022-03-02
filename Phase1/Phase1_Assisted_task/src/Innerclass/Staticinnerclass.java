package Innerclass;

public class Staticinnerclass {
	static int data=10;
	
	static class inner{
	
	static void display() {
		System.out.println("this is the data value:"+data);
	}
	}
	public static void main(String[] args) {
		
		Staticinnerclass.inner in=new Staticinnerclass.inner();
		in.display();

	}

}
