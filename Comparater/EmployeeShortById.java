package Comparater;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //return Integer.compare(o2.getId(), o1.getId()); 
        // return o2.getId() - o1.getId();//Desc order
        return o1.getId() - o2.getId();// id aesc m order
    }
}