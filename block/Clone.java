package block;

public class Clone {
	
	public class Example implements Cloneable {
	    public void display() {
	        System.out.println("Object created using clone()");
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    public void main(String[] args) {
	        try {
	            Example original = new Example();
	            Example clone = (Example) original.clone();
	            clone.display();
	            
	     
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
	}


}
