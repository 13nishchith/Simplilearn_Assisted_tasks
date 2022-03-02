package SearchEmailid;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SearchEmailID {
	 public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();
	 }





public static void main(String[] args) {
	String[] emailIds = {"nishchith@mphasis.com","dhruvik@mphasis.com" , "vinaymphasis.com", "chaitanya@mphasis.com","abhi@mphasis.com","rahul@mphasis.com"};
	 for (String value : emailIds) {
         System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
     }
	
	
	
	while(true) {
		System.out.println("Enter the Email id to search");
		Scanner sc=new Scanner(System.in);
		
	String name=sc.nextLine();
	 System.out.println("The Email address " + name + " is " + (isValidEmail(name) ? "valid" : "invalid"));
     
	
	
	
	}
}

}

