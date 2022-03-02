package Innerclass;

public class memberinnerclass {
	class meminnerclass{
		void display() {
			System.out.println("This is local inner class ");
		}
	}
	public static void main(String[] args) {
		memberinnerclass in=new memberinnerclass();
		meminnerclass n=in.new meminnerclass();
		n.display();
		
	}

}
