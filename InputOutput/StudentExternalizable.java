

package InputOutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author lokesh solanki
 * in this class sir remove Transient keyword and ask output 
 *
 */
public class StudentExternalizable implements Externalizable {

    transient int id;
	public String name;

	public StudentExternalizable() {	
	}

	public StudentExternalizable(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		id = in.readInt();
	}
	
	@Override
	public String toString() {
		
		return "id = "+id+" name = "+name;
	}

}

