package orderstatistics;

import java.util.Arrays;
import java.util.Scanner;

public class SortKthElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,5,3,19,7};
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter k");
		int k=sc.nextInt();
		int output=  SortKthElementExample.kthsmallestelement(arr,k);
		System.out.println(output);
		//int output1=  SortKthElementExample.kthlargestelement(arr,k);
		//System.out.println(output1);
		//break;
		}
	}
	static int kthsmallestelement(int arr[],int k) {
		
		Arrays.sort(arr);

		return arr[k-1];
	}
	/*static int kthlargestelement(int arr[],int k) {
		int n=arr.length;
		Arrays.sort(arr);
		return arr[n-k];
	}*/

}
