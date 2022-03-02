package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:testfile1.txt");
		try {
			Scanner sc = new Scanner(file);	
			while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
}
