package by_runnable;

public class RunMain {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new RunThread(), "run-1");
		Thread t2=new Thread(new RunThread(), "run-2");
		Thread t3=new Thread(new RunThread(), "run-3");
		Thread t4=new Thread(new RunThread(), "run-4");
		Thread t5=new Thread(new RunThread(), "run-5");
		Thread t6=new Thread(new RunThread(), "run-6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+i);
//			try {
//				Thread.currentThread().sleep(1500);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//		}
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Main thread ends here");

	}

}
//try methods like suspend, setDeamon, yield