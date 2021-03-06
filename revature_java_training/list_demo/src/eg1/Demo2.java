package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(null);
		al.add(20);
		al.add(22);
		al.add(null);
		al.add(10);
		System.out.println("al = "+al);
		
		List<Integer> ll=new LinkedList<>(al);
		System.out.println("ll = "+ll);
		ll.addAll(al);
		System.out.println("ll = "+ll);
		ll.clear();
		System.out.println("ll = "+ll);
		ll.add(10);
		ll.add(100);
		ll.add(11);
		ll.add(10);
		System.out.println("ll = "+ll);
		//al.retainAll(ll);
		al.removeAll(ll);
		System.out.println("al = "+al);
		
		//Collections.sort(ll);
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		Collections.reverse(ll);
		
		System.out.println(ll);
		ll.add(10);
		ll.add(10);
		Collections.sort(ll);
		System.out.println("ll = "+ll);
		System.out.println(Collections.binarySearch(ll, 1000));
		
		
		
		
		
		
		
	}

}
