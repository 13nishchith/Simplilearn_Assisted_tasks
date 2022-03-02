package threadcreation;

public class Extendingthreadclass extends Thread {
	public void run() {
		System.out.println("This is extended thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Extendingthreadclass thread=new Extendingthreadclass();
		thread.start();
	}

}
