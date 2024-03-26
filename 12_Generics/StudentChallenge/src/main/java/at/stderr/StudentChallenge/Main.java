package at.stderr.StudentChallenge;

import at.stderr.StudentChallenge.module.LPAStudent;
import at.stderr.StudentChallenge.module.Student;
import at.stderr.StudentChallenge.util.QueryList;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        int studentCount = 25;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }

        QueryList lpaStudents = new QueryList();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        students.sort(Student.byYearStarted);
        //printMoreList(students);

//        QueryList completed = lpaStudents.getMatches("percentComplete", "20");
//        completed.sort(LPAStudent.byPercentComplete);
//        printMoreList(completed);

        QueryList years = QueryList.getMatches(lpaStudents,"yearstarted", "2020");
        // printMoreList(years);
        List percent = QueryList.getMatches(years, "percentcomplete", "20");
        printMoreList(percent);

        //System.out.println(students.get(2).compareByYear(students.get(3)));
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
}
