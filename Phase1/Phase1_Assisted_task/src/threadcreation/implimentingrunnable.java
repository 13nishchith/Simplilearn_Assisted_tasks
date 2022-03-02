package threadcreation;
class multi implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
}
public class implimentingrunnable {

	public static void main(String[] args) {
		multi thread=new multi();
		Thread t1=new Thread(thread);
		Thread t2=new Thread(thread);
		Thread t3=new Thread(thread);
		t1.start();
		t2.start();
		t3.start();
	}

}
