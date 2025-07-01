package nandi;

public class TestDeep {
	public static void main(String[] args) throws CloneNotSupportedException  {

		Customer c = new Customer("kapil");
		Customer c1 = (Customer) c.clone();
		c1.name = "rahul";
		c1.no.balance = 200;

		System.out.println(c.name);
		System.out.println(c.no.balance);

		System.out.println(c1.name);
		System.out.println(c1.no.balance);

	}

}