
package Thread;

public class TestJoinWithThread {

	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("nandani");

		JoinThread t2 = new JoinThread("yash");

		t1.start(); // Start t1 first

		

			try {
				t1.join();          // Wait for t1 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}                              
		
			t2.start(); // Start t2 after t1 completes
		
	}

}