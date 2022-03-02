package Calculator;
import java.util.Scanner;

public class ProjectCalculator {

	public static void main(String[] args) {
		
		while(true) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("select the choice: 1: Addition 2: Subtraction 3: Multipication 4: Division 5: Exit");
		int s=sc1.nextInt();
		
		
		 if(s==1) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int a1=sc.nextInt();
			System.out.println("enter second number");
			int b1=sc.nextInt();
			System.out.println("Addition of " +a1+ " and " +b1+ " is " +(a1+b1));
			System.out.println();
			
			}
		else if(s==2) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int a1=sc.nextInt();
			System.out.println("enter second number");
			int b1=sc.nextInt();
			System.out.println("Subtraction of " +a1+ " and " +b1+ " is " +(a1-b1));
			System.out.println();
			
		}
		else if(s==3) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int a1=sc.nextInt();
			System.out.println("enter second number");
			int b1=sc.nextInt();
			System.out.println("Multiplication of " +a1+ " and " +b1+ " is " +(a1*b1));
			System.out.println();
		}
		else if(s==4) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int a1=sc.nextInt();
			System.out.println("enter second number");
			int b1=sc.nextInt();
			System.out.println("Division of " +a1+ " and " +b1+ " is " +(a1/b1));
			System.out.println();
		}
		else if(s==5) {
			System.out.println("calculator off");
			break;
		}
		
	
 }
 }
}
	
			
		
		
		