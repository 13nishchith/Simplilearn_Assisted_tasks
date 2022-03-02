package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
	static void createFileUsingFileClass() throws IOException {
		File file = new File("D:", "testFile1.txt");
		
		
		// Write content into file
		System.out.println("file created");
		FileWriter fileWriter = new FileWriter(file);
		System.out.println("write to the file");
		fileWriter.write("Hello!! This is simplilearn! ");
		fileWriter.write("you can use this opertunity to learn with simplilearn ");
		fileWriter.append("a ");
		fileWriter.append("this is a good place to learn ", 0, 30);
		fileWriter.append(null);


		fileWriter.close();
		
	}
	
	

	

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		File file=new File("D:testFile1.txt");
		Scanner sc=new Scanner(file);
		System.out.println("After reading content in the file");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		

	}

}
