package byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		String s="EndofFile";
		
		try {
			fos=new FileOutputStream("data.txt",true);
			bos=new BufferedOutputStream(fos);
			byte b[]=s.getBytes();
			bos.write(b);
			System.out.println("Info written to file");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
