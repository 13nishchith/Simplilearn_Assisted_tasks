package methoddemo;

public class callmethod {

		int val=550;

		int operation(int val) {
			val =val*100/10;
			return(val);
		}

		public static void main(String args[]) {
			callmethod d = new callmethod();
			System.out.println("Before calling method  value of data is "+d.val);
			d.operation(500);
			System.out.println("After calling method value of data is "+d.val);
			}
		}


