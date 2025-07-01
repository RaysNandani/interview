

package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterface {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");

		System.out.println(m.size());
		//System.out.println(m);
		m.replace(2, "bb");
		//System.out.println(m);
		m.putIfAbsent(6, "f");
		//System.out.println(m);
		System.out.println(m.isEmpty());
		//System.out.println(m);
		System.out.println(m.get(5));
		//System.out.println(m);
		System.out.println(m.containsKey(4));
		//System.out.println(m);
		System.out.println(m.containsValue("d"));
		//System.out.println(m);
		System.out.println("+++++++++++++++++++++++++++++++++");

		TreeMap t = new TreeMap();

		t.put(1, "hello sir ");
		t.put(2, "nandani kumbhkar");
		t.put(3, "yess");
		t.put(4, "noo");
		t.put(5, "early");

		System.out.println(t.firstKey());
		//System.out.println(t);
		System.out.println(t.lastKey());
		//System.out.println(t);
		System.out.println(t.pollLastEntry());
		//System.out.println(t);
		System.out.println(t.pollFirstEntry());
		//System.out.println(t);
		System.out.println(t.higherKey(2));
		//System.out.println(t);
		System.out.println(t.lowerKey(5));
		//System.out.println(t);
		System.out.println(t.firstEntry());
		//System.out.println(t);
		System.out.println(t.lastEntry());
		//System.out.println(t);

		//System.out.println(t);
		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "ncs");
		l.put(2, "bhopal");
		l.put(3, "indore");
		l.put(2, "lokesh");
		l.put(5, "nandani");

		l.replace(1, "new dewas");
		l.remove(3);
		System.out.println(l.entrySet());
		//System.out.println(l);
		System.out.println(l.keySet());
		//System.out.println(l);
		System.out.println(l.values());
		//System.out.println(l);
	}

}
