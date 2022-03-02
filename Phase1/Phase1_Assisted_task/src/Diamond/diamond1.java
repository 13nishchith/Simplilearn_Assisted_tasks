package Diamond;
interface section1{
	 default void student(){
		System.out.println("this student from section1");
	}
}
interface section2{
	 default void student(){
		System.out.println("this student from section2");
	}
}

public class diamond1 implements section1,section2{
	public void student() {
		section1.super.student();

		section2.super.student();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond1 d=new diamond1();
		d.student();

	}

	

}
