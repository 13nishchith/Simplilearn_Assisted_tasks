package Subsequence;



	public class Subsequences {
		 static int subs(int arr[], int n)
		    {
		        int subs[] = new int[n];
		        int i, j, max = 0;
		  
		        for (i = 0; i < n; i++)
		            subs[i] = 1;
		  
		        for (i = 1; i < n; i++)
		            for (j = 0; j < i; j++)
		                if (arr[i] > arr[j] && subs[i] < subs[j] + 1)
		                    subs[i] = subs[j] + 1;
		  
		        for (i = 0; i < n; i++)
		            if (max < subs[i])
		                max = subs[i];
		       
		        return max;
		    }
		  
		    public static void main(String args[])
		    {
		        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		        int n = arr.length;
		        System.out.println();
		       
		        System.out.println("Length of subsequence is " + subs(arr, n) + "\n");
		    }
	

}
