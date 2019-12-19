package eg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("persist.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Object deserialized is ");
			System.out.println(cc);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
