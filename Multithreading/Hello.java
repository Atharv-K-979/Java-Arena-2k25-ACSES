class threadable implements Runnable{
	@Override
	public void run() {
	
		for (int i=0;i<10 ;i++ ) {
            System.out.println("World");
            if(i==5) {
            		try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					    System.err.println("Thread interrupted");
					}
            }
        }
	}
}


public class Hello {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("bhargav is the best. But he has to learn Java");
		Thread t1=new Thread(new threadable());
		Thread t2=new Thread(new threadable());
		Thread t3=new Thread(new threadable());
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(10);
		t2.setPriority(2);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.join();
		System.out.println("done 1");
		t2.join();
		System.out.println("done 2");
		t3.join();
		System.out.println("done 3");
		
		
		System.out.println("done executing, exiting......");
		
	}
}
