package at.stderr.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        List<String> list = new ArrayList<String>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----");
        // var is not strictly requierd, type can be infered
        list.forEach((var s) -> System.out.println(s));

        System.out.println("-----");
        String prefix = "nato";
        list.forEach((s) -> {
            char first = s.charAt(0);
            System.out.println(prefix + " " + s + " means " + first);
        });
    }
}
