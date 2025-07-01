package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {
	 public static void main(String[] args) {
		
		 Collection<Integer>c = new ArrayList<>();
		 Collection<Integer>c1 = new ArrayList<>();
		 
		 
		 
		 c1.add(100);
		 c.add(200);
		 c.add(300);
		 c.add(400);
		 c.add(500);
		 c.add(600);
	
		 System.out.println(c.add(100));
		 System.out.println(c);
		System.out.println(c.addAll(c1));
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c);
		System.out.println(c.contains(100));
		System.out.println(c);
		System.out.println(c.containsAll(c1));
		System.out.println(c);
		System.out.println(c.isEmpty());
		System.out.println(c);
		System.out.println(c.remove(100));
		System.out.println(c);
		System.out.println(c.removeAll(c1));
		System.out.println(c);
		c.clear();
		
		System.out.println(c);
		
	 }

}
