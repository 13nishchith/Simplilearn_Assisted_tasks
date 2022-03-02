package typecasting;

public class typecastingtechnique {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char g='G';
		System.out.println("Value of a: "+g);
		
		int l=g;
		System.out.println("Value of b: "+l);
		
		float m=g;
		System.out.println("Value of c: "+m);
		
		long n=g;
		System.out.println("Value of d: "+n);
		
		double o=g;
		System.out.println("Value of e: "+o);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double e=565.5;
		int f=(int)e;
		System.out.println("Value of x: "+e);
		System.out.println("Value of y: "+f);
		
	}
}

