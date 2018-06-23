package mythreads;

public class bla {
	
	public static void main(String[] args) {
		
		Runnable th1=new Thread1();
		Runnable th2=new Thread2();
		
		
		new Thread(th1).start();
		new Thread(th2).start();
		
		
		
	}

}
