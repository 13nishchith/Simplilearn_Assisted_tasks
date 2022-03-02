package LinearSearch;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,3,0,50};
		System.out.println("enter the element to search");
		Scanner sc= new Scanner(System.in);
		int value = sc.nextInt();
		int result= Linearsearch.linearsearch(arr,value);
		if(result==-1) {
			System.out.println("no element");
			
		}else {
			System.out.println("element" + arr[result] + "found at " + result);
		}
		
		
		
	}


public static int linearsearch(int arr[],int x) {
	for(int i=0;i<arr.length;i++ ) {
		if(arr[i]==x) {
			return i;
		}
		
	}return -1;
}
}