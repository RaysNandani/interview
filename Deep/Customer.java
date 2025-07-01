package Deep;

public class Customer implements Cloneable {

	public String name;

	public Account no;

	public Customer(String name) {
		this.name = name;
		no = new Account(100);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
	c.no = (Account) no.clone();
		return c;
	}

}