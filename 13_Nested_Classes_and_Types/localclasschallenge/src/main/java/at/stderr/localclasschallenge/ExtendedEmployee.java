package at.stderr.localclasschallenge;

import java.time.LocalDate;
import java.util.Date;

public class ExtendedEmployee {

    private Employee employee;
    String fullName;
    int yearsWorked;

    public ExtendedEmployee(Employee employee) {
        this.employee = employee;
        this.fullName = getFullName();
        this.yearsWorked = calculateYearsWorked();
    }

    private String getFullName() {
        return employee.firstName() + " " + employee.lastName();
    }

    private int calculateYearsWorked() {
        int currentyear = LocalDate.now().getYear();
        int hireyear = employee.hireDate().getYear();
        return currentyear - hireyear;
    }
}
