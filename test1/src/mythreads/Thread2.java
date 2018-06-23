package mythreads;

public class Thread2 implements Runnable {

	
	public void run() {
		
		try {
			Thread.sleep(10000);
			System.out.println("Hello (every 10 seconds)");
			
		}catch(InterruptedException e) {}
	}

}
