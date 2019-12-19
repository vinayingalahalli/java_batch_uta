package eg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {
		CreditCard cc=new CreditCard(1234567890123456L, "kevin", "MyBank", 100);
		
		try(FileOutputStream fos=new FileOutputStream("persist.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			oos.writeObject(cc);
			System.out.println("Data Persisted/serialized was");
			System.out.println(cc);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
