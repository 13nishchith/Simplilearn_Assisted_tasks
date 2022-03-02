package Constructors;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	this.id=i;
	this.name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Parameterizedconstructor {
	public static void main(String[] args) {

	Std std1=new Std(22,"roopa");
	Std std2=new Std(156,"Anusha");
	std1.display();
	std2.display();
		}
}




