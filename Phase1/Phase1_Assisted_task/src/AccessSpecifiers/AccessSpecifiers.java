package AccessSpecifiers;
class defaultAccessSpecifiers{
	void display() {
		System.out.println("this is default access specifiers method");
	}
}
public class AccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default access specifiers");
		defaultAccessSpecifiers d=new defaultAccessSpecifiers();
		d.display();
	}

}
