
 



package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetIterator {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(500);
		s.add(600);

		Iterator <Integer>it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}