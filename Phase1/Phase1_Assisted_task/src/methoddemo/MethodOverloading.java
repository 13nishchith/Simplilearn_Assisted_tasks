package methoddemo;

public class MethodOverloading {
	public void areaoftriangle(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void areaofcircle(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	 MethodOverloading ob=new  MethodOverloading();
       ob.areaoftriangle(5,6);
       ob.areaofcircle(50);  
   }

}
