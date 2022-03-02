package collections;

import java.util.Scanner;
import java.util.Stack;

public class Stackcollection {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter elements to stack");
	
		
		Stack<Integer> sct=new Stack<>();
		int s=sc.nextInt();
		sct.push(s);
		int s1=sc.nextInt();
		sct.push(s1);
		int s2=sc.nextInt();
		sct.push(s2);
		int s3=sc.nextInt();
		sct.push(s3);
		System.out.println("the elements in the stack are:");
		for(Integer a:sct)
		System.out.println(a);
		}
	}


