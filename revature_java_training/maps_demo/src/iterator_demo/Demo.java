package iterator_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(122, "java");
		hm.put(100, "jee");
		hm.put(112, "jme");
		hm.put(12, "python");
		hm.put(44, "c#");
		hm.put(128, null);
		System.out.println("Before Deletion");
		System.out.println(hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getKey()%4==0) {
//				hm.remove(e.getKey());
//			}
//		}
		
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Integer,String> e=i.next(); //read and post increment
			if(e.getKey()%4==0) {
				i.remove();
			}
		}
		
		
		
		System.out.println("After Deletion");
		System.out.println(hm);
	}

}

//Enumerator -> read from top to bottom
//Iterator -> read & remove from top to bottom
//ListIterator -> add read remove and is bidirectional(applicable only on List)

