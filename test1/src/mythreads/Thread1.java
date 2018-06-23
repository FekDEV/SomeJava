package mythreads;

public class Thread1 implements Runnable {
	
	public void run() {
		
		try {
			Thread.sleep(5000);
			System.out.println("Hello (every 5 seconds)");
		}catch(InterruptedException e) {}
		
		
		
	}

}
