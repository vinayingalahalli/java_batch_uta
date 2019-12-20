package synch_eg;

public class Printer {

	public synchronized static void printMessages(Message message) {
		System.out.print(message.getMessage1());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(" "+message.getMessage2());
	}
}
//wait() notify() notifyAll()