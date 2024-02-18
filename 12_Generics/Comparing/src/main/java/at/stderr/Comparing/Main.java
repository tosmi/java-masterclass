package at.stderr.Comparing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
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

        Student ann = new Student("Ann");
        Student tim = new Student("Tim");
        Student zach = new Student("Zach");
        Student students[] = {
                zach,
                tim,
                ann,
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaComparator = new StundentGPAComparator();
        Arrays.sort(students, gpaComparator.reversed());
        System.out.println(Arrays.toString(students));
        System.out.println(ann.gpa + ann.name);
        System.out.println(tim.gpa + tim.name);
        System.out.println(gpaComparator.compare(tim, ann));
    }
}

class StundentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa +o2.name);
    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    String name;
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
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        // return name.compareTo(o.name);
        // .compareTo is an Object method from interface comparable so we need to
        // box the primitive id
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}