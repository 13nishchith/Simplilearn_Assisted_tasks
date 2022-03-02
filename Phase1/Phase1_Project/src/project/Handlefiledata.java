package project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Handlefiledata {
	 static String MY_Directory;
	    File myFolder;

	    public  Handlefiledata() {
	    	MY_Directory = System.getProperty(".dir");
	    	myFolder = new File(MY_Directory+"/files");
	        if (!myFolder.exists())
	        	myFolder.mkdirs();
	        System.out.println("MyFilePath : "+ myFolder.getAbsolutePath());
	    }
	    private static final String Main_page =
	            "\nSelect below option to continue\n"+ 
	            		"1 -> Reterive File names\n"+
	                    "2 -> Business level operation\n"+
	                    "3 -> Close application";

	    private static final String The_operation =
	            "   \nSelect the operations to perform: \n"+
	                    "   1 -> Add a file\n"+
	                    "   2 -> Delete a file\n"+
	                    "   3 -> Search a file\n"+
	                    "   4 -> Back to Main_page";
	   void firstoperation() {
		   System.out.println(Main_page); 
		   try(Scanner sc=new Scanner(System.in)){
			   int choice=sc.nextInt();
			   switch(choice) {
			   case 1:{
				   Showlistoffilename();
				   firstoperation();
			   }
			   case 2:{
				   secondoperation();
			   }
			   case 3:{
				   System.out.println("Thank you :)");
				   System.exit(0);
			   }default:{
				   firstoperation();
			   }
			   }
		   }catch(Exception e) {
			   System.out.println("Enter 1, 2 or 3 only");
			   firstoperation();
		   }
	   }

	private void secondoperation() {
		System.out.println(The_operation);
		 try(Scanner sc1=new Scanner(System.in)){
			   char[] option=sc1.nextLine().toLowerCase().trim().toCharArray();
			   char value=option[0];
			   switch(value) {
			   case '1':{  System.out.print("Enter a File Name to Add :");
               String filename = sc1.next().trim().toLowerCase();
               addFile(filename);
               break;
				   }
			   case '2':{
				   System.out.println("Enter a File Name to delete :");
				   String filename = sc1.next().trim();
	               deleteFile(filename);
	               break;
				   
			   }
			   case '3':{
				   System.out.println("Enter a File name to search :");
				   String filename = sc1.next().trim();
	               searchFile(filename);
	               break;
			   }
			   case '4':{
				   System.out.println("To back to main_page");
				   firstoperation();
				   break;
			   }
			   default:
				   System.out.println("Select the option to do operation");
			   }
			   secondoperation();
		 }catch(Exception e) {
			 System.out.println("Select the correct option");
			 secondoperation();
		 }
	}
	

	void searchFile(String filename)   { 
		String[] list = myFolder.list();
		for (String file: list) {
        if (filename.equals(file)) {
            System.out.println("FOUND : File " + filename + " present at " + myFolder);
            return;
        }
    }
    System.out.println("File Not found (FNF)");

			}

	void deleteFile(String filename) {
		 File filepath = new File(myFolder +"/"+filename);
	        String[] list = myFolder.list();
	        for (String file: list) {
	            if (filename.equals(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + myFolder);
	                return;
	            }
	        }
	        System.out.println("Delete Operation failed. FILE NOT FOUND");
	  
		
	}

	void addFile(String filename) throws IOException {
		 File filepath = new File(myFolder +"/"+filename);
	        String[] list = myFolder.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file)) {
	                System.out.println("File " + filename + " already present in " + myFolder);
	                return;
	            }
	        }
	        filepath.createNewFile();
	        System.out.println("File "+filename+" added to "+ myFolder);
	   
	
		
	}

	void Showlistoffilename() {
		 if (myFolder.list().length==0)
	            System.out.println("The directory is empty");
	        else {
	            String[] list = myFolder.list();
	            System.out.println("The files in "+ myFolder +" are :");
	            Arrays.sort(list);
	            for (String str:list) {
	                System.out.println(str);
	            }
	        }
	
		
	}

	public static void main(String[] args) {
		System.out.println("**Welcome to Lockers PVT.ltd**");
		System.out.println("==============================");
		System.out.println("Application name: File data");
		System.out.println("Developer details: Nishchith M");
		System.out.println("==============================");
		Handlefiledata data=new Handlefiledata();
		data.firstoperation();

	}

}
