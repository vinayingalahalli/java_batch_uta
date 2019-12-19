package byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("data.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			System.out.println("Bytes available before "+bis.available());
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Bytes available after"+bis.available());
			System.out.println("Info retrived from file is ");
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
