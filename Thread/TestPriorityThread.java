package Thread;



public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("nan");
		PriorityThread t2 = new PriorityThread("ballu");

		t1.setPriority(1);
		t2.setPriority(10);

		t1.start();
		t2.start();

	}

}