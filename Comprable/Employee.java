package Comprable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// we use this method but sir says give with another type so try below method
	//@Override

	/*
	 * public int compareTo(Employee o) { if (this.id > o.getId()) { return 1; } if
	 * (this.id < o.getId()) { return -1; }
	 * 
	 * return 0;
	 */
	
	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public int compareTo(Employee e) {

		//int diff = this.id - e.id;

		//System.out.println("this: " + this.id + " e: " + e.id + " diff: " + diff);

		// return this.id - e.id;

		// return e.name.compareTo(this.name);

		if (this.id == e.id) { 
			return e.name.compareTo(this.name); //same id name descending mee
		}
		return this.id - e.id;
	}
	
		
		/*  if (this.id == e.id) { 
		  return this.name.compareTo(e.name); //same id na  descending mee
		  } 
		  return this.id - e.id; 
		  }
		  */
		
		 
	/*
	 * if(this.name.equals(e.name)) { return e.id - this.id; } return this.id -
	 * e.id;
	 * 
	 * }
	 */
 

}