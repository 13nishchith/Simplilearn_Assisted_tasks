package ExponentionalSearch;
import java.util.Arrays;
import java.util.Scanner;
public class Exponentioalsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter the element to search");
			int key=sc.nextInt();
		
		int result=Exponentioalsearch.exponentialsearch(arr, 10, key);
		System.out.println("element found"+arr[result]+"at"+result);}

	}
	static int exponentialsearch(int[] arr,int n,int x) {
		if(arr[0]==x) {
			return 0;
			
		}
		int i=1;
		while(i<n && arr[i]<=x) {
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i, n-1),x);
		
	}

}
