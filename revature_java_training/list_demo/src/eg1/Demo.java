package eg1;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List lis=new ArrayList();
		lis.add("heyy");
		lis.add(1111);
		lis.add(null);
		lis.add(true);
		lis.add(null);
		lis.add(111);
		lis.add(22.333);
		System.out.println(lis);
		
		
		
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(null);
		al.add(20);
		al.add(22);
		al.add(null);
		al.add(10);
		System.out.println(al);
		
		al.add(1, 99);
		System.out.println(al);
		al.set(1, 1000);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(7));
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		Integer i=1000;
		al.remove(i);
		System.out.println(al);
		while(al.remove(null)) {}
		System.out.println(al);
		System.out.println(al.contains(10));
		
		
		
		
		
		
		
		
		
		
		

	}

}