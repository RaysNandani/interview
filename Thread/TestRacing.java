package Thread;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("lokesh");

		Racing t2 = new Racing("nikhil");

		t1.start();
		t2.start();
	}
}