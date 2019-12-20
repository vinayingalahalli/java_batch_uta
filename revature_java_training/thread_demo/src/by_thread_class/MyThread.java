package by_thread_class;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Executing " + Thread.currentThread().getName() + " id = " + Thread.currentThread().getId());
	}
}
