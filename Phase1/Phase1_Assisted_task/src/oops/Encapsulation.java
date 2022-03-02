package oops;
class student{
	 int id;
	 String name;
	 float fee;
	void emp() {
		System.out.println("this is encapsulation program");
		System.out.println(this.id+" "+this.name+" "+this.fee); 
	}
	student(int id, String name, float fee ){
		this.id=id;
		this.name=name;
		this.fee=fee;
		System.out.println("output");
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(1,"hee",45);
		s.emp();
		
	}

}
