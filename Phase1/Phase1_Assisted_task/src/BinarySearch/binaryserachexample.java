package BinarySearch;

import java.util.Scanner;

public class binaryserachexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter the element to search");
			int key=sc.nextInt();
		
		binarysearch(arr, 0, key, arr.length);
		}

	}
	public static void binarysearch(int arr[],int start,int key,int end) {
		int mid=(start+end)/2;
		
		while(start<= end) {
			if(arr[mid]<key) {
				start = mid+1;
			}else if(arr[mid] == key) {
				System.out.println("element found:"+mid);
				break;
			}else {
				end = mid-1;
			}
			mid = (start+end)/2;
		}if(start>end) {
			System.out.println("elment not found in array");
		}
	}
}
