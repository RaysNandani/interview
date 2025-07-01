package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpIdTest {
	public static void main(String[] args) {

		List<Emp> l = new ArrayList();
		l.add(new Emp(1770, "lokesh"));
		l.add(new Emp(4852, "nikhil"));
		l.add(new Emp(3000, "deepak"));
		l.add(new Emp(2852, "dogesh"));

		
		  l.stream().sorted(Comparator.comparingInt(Emp::getId)) .forEach(e ->
		  System.out.println(e.getId() + " =" + e.getName()));
		  
		 
		/*
		 * l.stream().sorted(Comparator.comparing(Emp::getName)) .forEach(e ->
		 * System.out.println(e.getId() + " =" + e.getName()));
		 */
	}

}