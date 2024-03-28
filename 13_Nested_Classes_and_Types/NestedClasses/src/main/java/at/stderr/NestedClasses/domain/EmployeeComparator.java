package at.stderr.NestedClasses.domain;

import java.util.Comparator;

public class EmployeeComparator <T extends  Employee> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getName().compareTo(o2.getName()));

        // XXX this does not work because it's a private field in the Employee class
        // return o1.yearstarted - o2.yearstarted;
    }
}
