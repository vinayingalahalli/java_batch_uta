package example1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s.equals("Hello"));
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("HEllo"));
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		System.out.println(s.startsWith("he"));
		System.out.println(s.endsWith("oll"));
		System.out.println(s.contains("ll"));
		System.out.println(s.contains("lol"));
		String s1="    dskjfdjskf     ";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println("HELLOOO".toLowerCase());
		
		String s2="hello hi good afternoon";
		String s3[]=s2.split(" ");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i].toUpperCase());
		}
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(2, 4));
		
		
		
		
		
		
		
		
		
		

	}

}
