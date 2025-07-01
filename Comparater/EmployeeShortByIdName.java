package Comparater;

import java.util.Comparator;

public class EmployeeShortByIdName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());  //id equall hogi to name print karega
		} else {
			return o1.getId() - o2.getId(); // aescending m print kare
		}
	}
}