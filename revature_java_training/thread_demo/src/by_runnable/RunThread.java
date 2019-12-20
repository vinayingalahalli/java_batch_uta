package by_runnable;

public class RunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.currentThread().sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
