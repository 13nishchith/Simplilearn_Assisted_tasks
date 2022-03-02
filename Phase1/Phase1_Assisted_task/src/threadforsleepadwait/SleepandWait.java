package threadforsleepadwait;
class testsleep implements Runnable{
	 public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
class testsleep2 implements Runnable{
	 public void run() {
		for(int i=101;i<=110;i++) {
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class SleepandWait {
	private static SleepandWait obj=new SleepandWait();


	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new testsleep());
		Thread t2=new Thread(new testsleep2());
		
		
		t1.start();
		t1.join();
		  synchronized (obj) 
	        {
	            obj.wait(1000);
	            System.out.println("Object '" + obj + "' is woken after" + " waiting for 1 second");
	        }
		  
			    
		t2.start();
	}

		

	}


