
package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(2);
		l.add(1);
		l.add(3);
		// l.add(2);

		Set unique = new HashSet();
		List duplicateList = new ArrayList();
		for (Object o : l) {
			if (!unique.add(o)) {
				duplicateList.add(o);
			}
		}

		List original = new ArrayList(unique);
		System.out.println("Original List: " + l);
		System.out.println("Unique List: " + unique);
		System.out.println("Duplicate List: " + duplicateList);
	}
}
