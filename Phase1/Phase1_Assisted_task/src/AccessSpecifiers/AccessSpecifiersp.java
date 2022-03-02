package AccessSpecifiers;
class privateAccessSpecifiers{
	private void display() {
		System.out.println("this is private access specifiers method");
	}
}
public class AccessSpecifiersp {

	public static void main(String[] args) {
		System.out.println("private access specifiers");
		privateAccessSpecifiers d=new privateAccessSpecifiers();
		//d.display();
	}

}
