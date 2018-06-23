package threads;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLesson2 {
	
	public static void main(String[] args) {
		addThreadsToPool();
		
	}
	
	public static void addThreadsToPool() {
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		//3 Threads
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);
		
		System.out.println("Number of Threads :"+ Thread.activeCount());
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);	//Puts all threads in listOfThreads
		
		for(Thread i : listOfThreads) {
			System.out.println(i.getName());
		}
		
		for(Thread i : listOfThreads) {
			System.out.println(i.getPriority());
		}
		
		listOfThreads[1].setPriority(1);  	//1 TO 10 ,10 is highest
		
		//eventPool.shutdown();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}

}
