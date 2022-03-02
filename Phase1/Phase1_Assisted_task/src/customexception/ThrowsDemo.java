package customexception;

public class ThrowsDemo {
    void Div() throws ArithmeticException
    {
        int a=45,b=0,tsd;
        tsd = a / b;
        System.out.print("The result is : " + tsd);
    }
     public static void main(String[] args)
    {
         ThrowsDemo T = new ThrowsDemo();
         try
        {
            T.Div();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("End of program.");
    }


}
