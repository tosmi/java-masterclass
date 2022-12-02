package at.stderr.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playground {

    public static void main(String[] args) {
        var l = new LinkedList<>(Arrays.asList("First", "Second", "Third"));
        var li = l.listIterator();

        // after next()
        //  First - Second - Third
        //        ^
        System.out.println(li.next());

        // after next()
        // First - Second - Third
        //                ^
        System.out.println(li.next());

        // after previous()
        // First - Second - Third
        //       ^
        System.out.println(li.previous());
    }
}
