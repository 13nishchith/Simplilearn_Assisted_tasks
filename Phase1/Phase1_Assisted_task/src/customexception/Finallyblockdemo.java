package customexception;

public class Finallyblockdemo {
	void division() {
		int a=10,b=0,c ;
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("you can't divide number by 0 ");
			e.printStackTrace();
		}finally {
			System.out.println("This line should print at final");
		}
		}

}
