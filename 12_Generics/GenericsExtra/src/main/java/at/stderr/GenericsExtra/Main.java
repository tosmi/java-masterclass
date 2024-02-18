package at.stderr.GenericsExtra;

import at.stderr.GenericsExtra.module.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        printList(students);
    }

    public static void printList(List<Student> students) {
        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
