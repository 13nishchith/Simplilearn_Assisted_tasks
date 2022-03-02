package Trycatch;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		 int[] arr = {1,2,3,4,5,6,7,8,9};
			//int arr[]= {1,3,4,5}; 
		try 
	        {   arr[6] = 3;
				//for(int i=0;i<=arr.length;i++) {
					//System.out.println(arr[i]);
				//}
	            
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + arr.length);
	        }


	}

}
