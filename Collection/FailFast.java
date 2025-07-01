package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {
		
	List<Integer> l = new ArrayList<Integer>();
	// 
	//ArrayBlockingQueue l = new ArrayBlockingQueue(5); // Exception Not raise es to hatane se fail safe bhi banaya ja skta hai
		l.add(1);
		l.add(3);
		l.add(2);

		Iterator<Integer> it = l.iterator();
		// l.clear();
		l.add(4); // Here we cannot add or remove elements only for ArrayBlockingQueue

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}