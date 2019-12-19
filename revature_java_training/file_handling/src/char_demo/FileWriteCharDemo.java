package char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("char.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello good evening\n");
			bw.write("no need of conversion when with char stream\n");
			bw.write("very much useful for UNICODE char set");
			System.out.println("Info written to file:)");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
