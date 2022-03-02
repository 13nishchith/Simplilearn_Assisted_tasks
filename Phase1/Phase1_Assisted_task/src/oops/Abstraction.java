package oops;
abstract class shape{
	abstract void draw();
}
//class Rectangle extends shape{
	//void draw() {
		//System.out.println("this is rectangle");
	//}
class Square extends shape{
	void draw() {
		System.out.println("this is a Square");
	}
	
}
	
//}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		shape shape=new Rectangle();
	//	shape.draw();
		shape shape1=new Square();
		shape1.draw();

	}

}
