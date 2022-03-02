package Filehandling;

import java.io.File;
import java.io.IOException;

public class Createafile {
	public static void main(String[] args) {
	File file=new File("D:testfile1.txt");
	boolean result;
	try {
		if(file.createNewFile()) {
			System.out.println("file created");
			//System.out.println(file.canRead());
			//System.out.println(file.canWrite());
			System.out.println("content write to a file");
			
		}else {
			System.out.println("file existed");
		}
	}catch(IOException e) {
		System.out.println("no file");
	
	} 
	}
}
