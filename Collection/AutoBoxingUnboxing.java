
package Collection;

public class AutoBoxingUnboxing {

	
	public static void main(String[] args) {

		// AutoBoxing
		// primitive data is converted into Object, it is called Auto-boxing
		int i = 10;  //int se interger karne ko autoboxing kahte hai
		Integer a = i;  

		System.out.println( a + "Autoboxing");

		// Unboxing
		// object data is converted into primitive type, it is called Auto-boxing
		Integer b = 15;  //intger se int karne ko unboxing kahte hai
		int c = b;
		System.out.println( c + "unboxing ");

	}
}
