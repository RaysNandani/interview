package block;


	import java.lang.reflect.Constructor;

	public class Refelection {
	    public void display() {
	        System.out.println("Object created using Constructor.newInstance()");
	    }

	    public static void main(String[] args) {
	        try {
	            Constructor<Refelection> constructor = Refelection.class.getDeclaredConstructor();
	            Refelection example = constructor.newInstance();
	            example.display();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	

}

	