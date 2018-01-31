package testJava;

public class TestThread {

	public static void main(String[] args) {
		
		final Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println(" print i in thread 1====="+i);
				}
			}
		};
		final Thread t2=new Thread(){
			public void run(){
				try {
					t1.join(5000, 50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i=1000;i<2000;i++){
					System.out.println(" print i in thread 2======="+i);
				}
			}
		};
		final Thread t3=new Thread(){
			public void run(){
				try {
					t2.join(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i=2000;i<3000;i++){
					System.out.println(" print i in thread 3====="+i);
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
