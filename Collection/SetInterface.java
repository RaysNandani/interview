
package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		//h.add(500);
        
		System.out.println(h.contains(200));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.remove(400));
		System.out.println(h);
		/*
		 * // //System.out.println(h);
		 * 
		 * 
		 * System.out.println("====================================");
		 * 
		 * TreeSet t = new TreeSet(); t.add(10); t.add(20); t.add(30); t.add(40);
		 * t.add(50);
		 * 
		 * System.out.println(t.contains(10)); System.out.println(t.ceiling(700));
		 * System.out.println(t.first()); System.out.println(t.pollFirst());
		 * System.out.println(t.size()); System.out.println(t.pollLast());
		 * //System.out.println(t);
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * LinkedHashSet l = new LinkedHashSet(); l.add(1); l.add(2); l.add(3);
		 * l.add(4); l.add(5);
		 * 
		 * System.out.println(l.contains(5)); System.out.println(l.isEmpty());
		 * System.out.println(l.size()); System.out.println(l.remove(14));
		 * System.out.println(l.hashCode()); //System.out.println(l.toArray());
		 */	}
}