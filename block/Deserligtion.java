package block;

	import java.io.*;

	public class Deserligtion implements Serializable {
	    public void display() {
	        System.out.println("Object created using deserialization");
	    }

	    public static void main(String[] args) {
	        try {
	            // Serialize the object
	            Deserligtion original = new Deserligtion();
	            FileOutputStream fos = new FileOutputStream("example.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(original);
	            oos.close();

	            // Deserialize the object
	            FileInputStream fis = new FileInputStream("example.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            Deserligtion deserialized = (Deserligtion) ois.readObject();
	            ois.close();

	            deserialized.display();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	

}
