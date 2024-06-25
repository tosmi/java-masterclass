package at.stderr.methodreferenceschallenge;

import java.io.StringBufferInputStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Random random = new Random();

    private record Person(String first) {

        public String last(String s) {
            return first + " " + s.substring(0,s.indexOf(" "));
        }
    }

    public
    static void main( String[] args ) {
        String[] array = {"Toni", "Anna", "Bob", "Martha"};
        Person toni = new Person("Toni");

        // either UnaryOperator<String> or Function<String, String>
        //List<Function<String,String>> t = new ArrayList<>(List.of(
        List<UnaryOperator<String>> t = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + (char) random.nextInt(65,92) + ".",
                s -> s += " " + reverse(s, 0, s.indexOf(" ")),
                Main::reverse,
                // s -> new String("Howdy " + s),
                toni::last,
                (new Person("Marry"))::last
        ));

        //t.add(String::toUpperCase);
        //t.add( s -> s += " " + (char) random.nextInt(65,92) + ".");

        transformArray(array, t);
    }

    public static void transformArray(String[] array, List<UnaryOperator<String>> transformers) {
        List<String> list = Arrays.asList(array);

        for (var f : transformers) {
             list.replaceAll(s -> s.transform(f));
            //list.replaceAll(f::apply);
            System.out.println(Arrays.toString(array));
        }

        /*list.replaceAll(s -> {
            for(UnaryOperator<String> u : transformers) {
                s = u.apply(s);
            }
            return s;
        });*/

    }
    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}
