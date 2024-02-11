package at.stderr.Comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Integer five = 5;
        Integer others[] = {0,5,10,-50,50};
        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple","banana", "pear", "BANANA"};
        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:" + (int)'A' + " " +
                "a:" +(int)'a');
        System.out.println("B:" + (int)'B' + " " +
                "b:" +(int)'b');
        System.out.println("P:" + (int)'P' + " " +
                "p:" +(int)'p');

        Student tim = new Student("Tim");
        Student students[] = {
                new Student("Zach"),
                new Student("Tim"),
                new Student("Ann")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("TIM")));
    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    private String name;
    private int id;
    protected double gpa;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa= random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}