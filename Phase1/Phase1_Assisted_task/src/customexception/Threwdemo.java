package customexception;

public class Threwdemo {
    public static void main(String[] args)
    {
    	int a=55,b=5,td;
       // int a=55,b=0,td;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                td = a / b;
                System.out.print("\n\tThe result is : " + td);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }


}
