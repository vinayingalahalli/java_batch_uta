package eg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(122, "java");
		hm.put(100, "jee");
		hm.put(112, "jme");
		hm.put(12, "python");
		hm.put(null, null);
		hm.put(128, null);
		System.out.println(hm);
		hm.put(12, "updated");
		System.out.println(hm);
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(122, "java");
		lhm.put(100, "jee");
		lhm.put(112, "jme");
		lhm.put(12, "python");
		lhm.put(null, null);
		lhm.put(128, null);
		System.out.println(lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(122, "java");
		tm.put(100, "jee");
		tm.put(112, "jme");
		tm.put(12, "python");
		//tm.put(null, null);
		tm.put(128, null);
		System.out.println(tm);
		
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(122, "java");
		ht.put(100, "jee");
		ht.put(112, "jme");
		ht.put(12, "python");
		//ht.put(null, null);
		//ht.put(128, null);
		System.out.println(ht);
		
		System.out.println(ht.size());
		System.out.println(ht.containsKey(12));
		System.out.println(ht.containsValue("j"));
		
		ht.remove(12);
		System.out.println(ht);
		System.out.println(ht.get(100));
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		Set<Integer>  hs=ht.keySet();
		for(Integer i:hs) {
			System.out.println("Key = "+i+" value is "+ht.get(i));
		}
		
		for(Entry<Integer, String>e:ht.entrySet()) {
			System.out.println("Key is "+e.getKey()+" Value is "+e.getValue());
		}
		

	}

}
