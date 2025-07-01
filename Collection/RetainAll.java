package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	// If c1 and c2 have no elements in common, c1 becomes empty.
	public static void main(String[] args) {

		Collection c1 = new ArrayList();
 
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add('a');
		c1.add('b');
		c1.add(null);

		Collection c2 = new ArrayList();

		c2.add('a');
		c2.add('b');
		c2.add('c');
		c2.add('d');
		c2.add(null);

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

		c2.retainAll(c1);

		System.out.println("c1 => " + c1);
		System.out.println("c2 => " + c2);

	}

}