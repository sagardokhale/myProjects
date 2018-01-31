package testJava;

public class ThreadSynchronization extends Thread{
	
	static int i=0;
	 static void increament(){
		for(int j=0;j<10;j++){
			System.out.println("i in increment ==="+i+" "+Thread.currentThread().getName());
			synchronized (ThreadSynchronization.class) {
				i++;
			}
			
		}
	}
	
	 void decrement(){
		for(int j=0;j<10;j++){
			synchronized (ThreadSynchronization.class) {
				ThreadSynchronization.i--;
			}
			System.out.println("i in decrement ==="+i+" "+Thread.currentThread().getName());
		}
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
		ThreadSynchronization.increament();
		decrement();
	}
	
	public static void main(String[] args) {
		ThreadSynchronization t1=new ThreadSynchronization();
		ThreadSynchronization t2=new ThreadSynchronization();
		t1.start();
		t2.start();
	}

}
