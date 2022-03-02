package Exceptionhandlers;
import java.io.IOException;
public class Myexception1 {

	void a() throws IOException  {
		
		throw new IOException();
	}
	
	void b() throws InterruptedException, IOException {
		a();
	}
	
	void c() {
		try {
			b();	
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Internal  error handled by C");
		}
		
	}
	
	
	void test() {
		
		String s= null;
		if(s!=null) {
			s.length();	
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Myexception1 obj = new Myexception1();
		obj.c();
		
		obj.test();

	}

}
