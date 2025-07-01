
package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		SortedMap<Integer,String> s=new TreeMap<>();
		s.put(1, "one");
		s.put(2, "two");
		s.put(3, "three");
		s.put(4, "four");
		s.put(5, "five");
		
		
		System.out.println(s.lastKey());
		//System.out.println(s);
		System.out.println(s.firstKey());
		//System.out.println(s);
		System.out.println(s.tailMap(3));
		
		//System.out.println(s);
		
		System.out.println(s.headMap(3));
		//System.out.println(s);
		System.out.println(s.entrySet());
	  //  System.out.println(s);
		System.out.println(s.subMap(2, 4));
		System.out.println(s);
	}

}