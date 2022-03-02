package Regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressions {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("^[a-zA-Z]+", "hello"));
		System.out.println(Pattern.matches("^[a-zA-Z]+", "hello"));
		
			String pattern = "[a-z]+";
			String check = " This Is The Regular Expressions Code";
			Pattern p = Pattern.compile(pattern);
			Matcher c = p.matcher(check);
			
			while (c.find())
		      	System.out.println( check.substring( c.start(), c.end() ) );
			}
	

	}


