package at.stderr.localclasschallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
record Employee(String firstName, String lastName, LocalDate hireDate) {}

public class Main 
{
    public static void main( String[] args ) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", LocalDate.of(1999,12,10)));

        System.out.println("test");

    }
}
