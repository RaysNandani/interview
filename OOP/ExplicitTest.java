package OOP;

/**
 * @author lokesh solanki
 *         in this class sir says if don't wanna use the super
 *         keyword so what happens so the ans is = if superclass have
 *         parameterize constructor we must need to invoke this constructor in
 *         subclass using super keyword otherwise a compile time error will
 *         occure. if we dont use super keyword we must define a default
 *         constructor on the parent class
 */
public class ExplicitTest extends Explicit {

	public ExplicitTest(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ExplicitTest e = new ExplicitTest("lokesh");
	}

}