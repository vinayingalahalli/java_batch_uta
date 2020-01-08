package synch_eg;

public class Message implements Runnable {

	private String message1;
	private String message2;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public Message(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
		Thread t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		Printer.printMessages(this);
		
	}
	
}