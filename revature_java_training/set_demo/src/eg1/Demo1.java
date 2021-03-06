package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("hi");
		hs.add("hi");
		hs.add("hello");
		hs.add("java");
		hs.add("jee");
		hs.add(null);
		hs.add(null);
		hs.add("jme");
		hs.add("void");
		System.out.println(hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hi");
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("java");
		lhs.add("jee");
		lhs.add(null);
		lhs.add(null);
		lhs.add("jme");
		lhs.add("void");
		System.out.println(lhs);
		
		Set<String> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("hi");
		ts.add("hi");
		ts.add("hello");
		ts.add("java");
		ts.add("jee");
		//ts.add(null);
	///ts.add(null);
		ts.add("jme");
		ts.add("void");
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("hey"));
		for(String s:ts) {
			System.out.println(s);
		}
		ts.remove("void");
		System.out.println(ts);
	}

}
