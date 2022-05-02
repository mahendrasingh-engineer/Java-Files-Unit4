package ans2;



 public  class   Deadlock {
	 synchronized static void fun1() throws InterruptedException {
		 Thread.sleep(1000);
		 synchronized(S.class) {
			 
		 }
	}
	
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(()-> {
			
			System.out.println("thread-1 is waiting for esources");
			try {
				Deadlock.fun1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thred 1 completed");
		});
		Thread t2=new Thread(()-> {
			System.out.println("thred 2 is waiting for the resources");
			S.fun1();
			System.out.println("thread 2 completed");
		});
		
		t1.start();
		t2.start();
		System.out.println("main thread ended");
}
 }

class S{
	synchronized static void fun1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 synchronized(Deadlock.class) {
		 }
	}
}
