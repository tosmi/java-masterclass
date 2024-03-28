package at.stderr.NestedClasses.domain;

import java.util.Comparator;

public class Employee {
    public static class EmployeeComparator <T extends  Employee> implements Comparator<Employee> {
        private final String sortType;

        public EmployeeComparator() {
            this.sortType = "name";
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return switch(sortType) {
                case "yearStarted" -> o1.yearStarted - o2.yearStarted;
                default -> o1.name.compareTo(o2.name);
            };
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
