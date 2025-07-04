
package Thread;

public class IsAliveMethod extends Thread {
	@Override
	public void run() {
		System.out.println("Method is alive........");
	}

	public static void main(String[] args) {
		IsAliveMethod t1 = new IsAliveMethod();
		IsAliveMethod t2 = new IsAliveMethod();

		System.out.println(t1.isAlive());
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t2.isAlive());
		System.out.println(t1.isAlive());
	}

}