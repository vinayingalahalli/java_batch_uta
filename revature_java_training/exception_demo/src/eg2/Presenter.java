package eg2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
	
		Opener o=new Opener();
		try {
			o.openFile("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
