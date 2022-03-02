package customexception;
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 

public class custexceptions {
	public static void main(String[] args) {
	

        try
        { 
            throw new MyException("temp "); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught exception"); 
            System.out.println(ex.getMessage()); 
        } 

	}
	
}

