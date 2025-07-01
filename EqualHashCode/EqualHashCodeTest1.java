package EqualHashCode;

import java.util.*;

public class EqualHashCodeTest1 {
    public static void main(String[] args) {
        EqualHashCode e1 = new EqualHashCode(1, "lokesh", 500);
        EqualHashCode e2 = new EqualHashCode(1, "lokesh", 500);
        EqualHashCode e3 = new EqualHashCode(3, "lokesh", 100);  

        System.out.println("e1.equals(e2): " + e1.equals(e2)); 
        System.out.println("e1.equals(e3): " + e1.equals(e3));

        // ********** LIST DEMONSTRATION **********
		
        
        
		  List<EqualHashCode> list = new ArrayList<>();
		  list.add(e1);
		  list.add(e2); //Duplicate object, List allows duplicates
		  list.add(e3);
		  
		  System.out.println("\nList contents:");
		  
		  
		  System.out.println(list.contains(e1));
		  
		  System.out.println("\nRemoving key 2..."); 
		  list.remove(e1); // Removing second
		   System.out.println(list);
		  
		 // Both objects will be printed

        // ********** SET DEMONSTRATION **********
		/*
		 * Set<EqualHashCode> set = new HashSet<>(); set.add(e1); set.add(e2); // Since
		 * e1.equals(e2), only one instance will be stored set.add(e3); // Different
		 * object, so it will be added
		 * 
		 * System.out.println("\nSet contents:"); System.out.println(set);
		 */// Only two unique objects should be printed

        // ********** MAP DEMONSTRATION **********
		/*
		 * Map<Integer, EqualHashCode> map = new HashMap<>(); map.put(1, e1); map.put(2,
		 * e2); // Key is different, but value is equal to e1 map.put(3, e3); //
		 * Different object
		 * 
		 * System.out.println("\nMap contents:"); System.out.println(map);
		 * 
		 * 
		 * System.out.println("\nRemoving key 2..."); map.remove(2); // Removing second
		 * System.out.println(map);
		 */
    
    }
}

