

package Collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestAddOffer {
	public static void main(String[] args) {
		// Example no 1
		Queue q = new ArrayBlockingQueue(4);
		// offer method return true if value is inserted otherwise it gives false
		q.add(10);
		q.add(12);
		q.add(30); //object se jada add karege of exception dega
		q.add(40);
		
		//q.add(4);
		 
		System.out.println(q);

		Queue q1 = new ArrayBlockingQueue(3);

		q1.offer(11);
		q1.offer(12);
		q1.offer(13);
		
		
		System.out.println(q1);

		
	}
}
