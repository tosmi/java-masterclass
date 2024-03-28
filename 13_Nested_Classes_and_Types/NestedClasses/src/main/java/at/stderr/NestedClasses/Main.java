package at.stderr.NestedClasses;

import at.stderr.NestedClasses.domain.Employee;
import at.stderr.NestedClasses.domain.EmployeeComparator;
import at.stderr.NestedClasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee(10001, "Ralph", 2015),
                        new Employee(10005, "Carole", 2021),
                        new Employee(10022, "Jane", 2013),
                        new Employee(13151, "Laura", 2020),
                        new Employee(10050, "Jim", 2018)
                )
        );
//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        for ( Employee e : employees ) {
            System.out.println(e);
        }

        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(
                List.of(
                        new StoreEmployee(10015, "Meg", 2021, "Target"),
                        new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                        new StoreEmployee(10105, "Tom", 2020, "Macys"),
                        new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                        new StoreEmployee(10322, "Bud", 2016, "Target")
                )
        );

//        var genericEmployee = new StoreEmployee();
//        var comparator = genericEmployee.new StoreComparator<>();
        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee e: storeEmployees) {
            System.out.println(e);
        }
    }
}
