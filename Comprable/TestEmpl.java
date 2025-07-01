
package Comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TestEmpl {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(new Employee(1, "dipanshu"));
		l.add(new Employee(3,"amisha"));
		l.add(new Employee(2, "nandani"));
		l.add(new Employee(1, "Ballu"));
	//	l.add(new Employee(4, "sipanshu"));
		
		Collections.sort(l);
	
		for (Object object : l) {
			System.out.println(object);
		}
		
		//System.out.println(l);
		
	}
}
