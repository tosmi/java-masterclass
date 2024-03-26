package at.stderr.StudentChallenge.module;

import at.stderr.StudentChallenge.util.QueryItem;

import java.util.Comparator;
import java.util.Random;

public class Student implements QueryItem,  Comparable<Student> {
    private String name;
    private String course;
    private int yearStarted;

    private static int LAST_ID = 1000;
    private final int id;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = { "C++", "Java", "Python"};

    public static final Comparator<Student> byYearStarted = Comparator.comparingInt(Student::getYearStarted);

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name =  firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);

        // XXX this is a bad idea, as this is not threadsafe
        id = LAST_ID++;
    }

    @Override
    public String toString() {
        return "%-5d%-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }

    public int compareByYear(Student o) {
        return Integer.compare(yearStarted, o.yearStarted);
    }
}
