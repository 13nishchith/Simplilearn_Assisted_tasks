package Innerclass;

interface ainclass{
	abstract void display();
}

public class Anonymousinnerclass {

	public static void main(String[] args) {

		ainclass ain=new ainclass() {
			public void display() {
				System.out.println("This is anonymous innerclass");
			}
		};
		ain.display();
		
	}

}
