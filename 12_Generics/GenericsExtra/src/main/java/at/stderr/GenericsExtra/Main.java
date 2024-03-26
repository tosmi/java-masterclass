package at.stderr.GenericsExtra;

import at.stderr.GenericsExtra.module.LPAStudent;
import at.stderr.GenericsExtra.module.Student;
import at.stderr.GenericsExtra.util.QueryItem;
import at.stderr.GenericsExtra.util.QueryList;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int studentCount = 10;
        // does not work
        //List<Student> students = new ArrayList<LPAStudent>();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        students.add(new LPAStudent());
        //printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        //printList(lpaStudents);
        printMoreList(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreList(matches);

        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
        // var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "YearStarted", "2021");
        // QueryList.<Student>getMatches explicit type argument for the static method getMatches
        printMoreList(students2021);

        var test = QueryList.getMatches(lpaStudents, "percentComplete", "");
    }

    public static void printMoreList(List<? extends Student> students) {
        // does not work because the compile won't let us assign to the list
        // it does not excactly know which kind of type the list of students
        // could be lpastudend, student or any subtype of student
        // XXX but it's ok to assign subtypes to List<student>? why does
        // the compiler prohibit this?
        //Student last = students.getLast();
        //students.set(0, last);
        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String:" + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer:" + i.floatValue());
            }
            System.out.println( );
        }
    }

    /*public static void testList(List<String> list) {
        for (var element : list) {
            System.out.println("String: " + element.toUpperCase());
        }
    }

    public static void testList(List<Integer> list) {
        for (var element : list) {
            System.out.println("Integer: " + element.floatValue());
        }
    }*/


    /*public static <T extends Student> void printList(List<T> students) {
        for (var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }*/
}
