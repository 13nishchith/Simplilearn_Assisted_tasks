package Filehandling;

import java.io.File;
import java.io.IOException;

public class Deletefile {

	public static void main(String[] args) {
		File file=new File("D.testfile2.txt");
		boolean result;
		try {
			if(file.createNewFile()) {
				System.out.println("file created");
			}
		}catch(IOException e) {
			System.out.println("error for creating file");
		
		
	if(file.exists()) {
			System.out.println(file.delete());
			System.out.println("file deleted");
		}
		else {
			System.out.println("file not found");
		}

	}

}}
