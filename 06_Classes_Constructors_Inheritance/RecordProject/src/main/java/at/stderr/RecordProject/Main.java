package at.stderr.RecordProject;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Unanonymous";
                    },
                    "05/11/1989",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Anna", "05/12/1986",
                "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/12/1986",
                "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
