package Innerclass;

public class localinnerclass {

	
	void display() {
		class inner{
			void hello() {
				System.out.println("This is a local innerclass");
			}}
		inner d=new inner();
		d.hello();
		}
	public static void main(String[] args) {
		localinnerclass c=new localinnerclass();
		//InnerClass.inner obj=c.new inner();
		c.display();
	}

}
