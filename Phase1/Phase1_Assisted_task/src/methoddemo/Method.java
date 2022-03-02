package methoddemo;

public class Method {
	

		public int multiplication(int x,int y) {
			int z=x*y;
			return z;
		}

		public static void main(String[] args) {

			Method mul=new Method();
			int ans= mul.multiplication(100,35);
			System.out.println("Multiplication is :"+ans);
			}

}
