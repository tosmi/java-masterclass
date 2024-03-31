package at.stderr.localclasschallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
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
        employees.add(new Employee("JJ", "Abrams", LocalDate.of(1999,12,10)));
        employees.add(new Employee("Max", "Mustermann", LocalDate.of(1997,06,10)));
        employees.add(new Employee("Frank", "Zappa", LocalDate.of(2015,06,10)));

        printListOfEmployees(employees, "byName");
        printListOfEmployees(employees, "byYear");
    }

    public static void printListOfEmployees(List<Employee> employees,String sortOrder) {
        class ExtendedEmployee {
            private Employee employee;
            private String fullname;
            int yearsHired;

            public ExtendedEmployee(Employee employee) {
                this.employee = employee;
                //this.fullname = employee.firstName() + " " + employee.lastName();
                this.fullname = String.join(" ",employee.firstName(), employee.lastName());
                this.yearsHired = calculateYearsHired();
            }

            private int calculateYearsHired() {
                int currentyear = LocalDate.now().getYear();
                int hireyear = employee.hireDate().getYear();
                return currentyear - hireyear;
            }

            @Override
            public String toString() {
                return "%-10s%-15s%-20s%-15d".formatted(employee.firstName(),employee.lastName(), fullname, yearsHired);
            }
        }

        List<ExtendedEmployee> extendedEmployees = new ArrayList<>();
        for (var e : employees) {
            ExtendedEmployee extendedEmployee = new ExtendedEmployee(e);
            extendedEmployees.add(extendedEmployee);
        }

        var comparator = new Comparator<ExtendedEmployee>() {
            @Override
            public int compare(ExtendedEmployee o1, ExtendedEmployee o2) {
                return switch(sortOrder) {
                    case "byYear" -> o1.employee.hireDate().getYear() - o2.employee.hireDate().getYear();
                    default -> o1.employee.lastName().compareTo(o2.employee.lastName());
                };
            }
        };

        extendedEmployees.sort(comparator);
        for (ExtendedEmployee ee : extendedEmployees) {
            System.out.println(ee);
        }
    }
}
