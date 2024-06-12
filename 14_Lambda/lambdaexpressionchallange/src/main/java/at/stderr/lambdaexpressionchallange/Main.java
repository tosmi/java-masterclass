package at.stderr.lambdaexpressionchallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static Random random = new Random();
    public static void main( String[] args ) {
        String[] array = {"Toni", "Anna", "Bob", "Martha"};
        List<String> list = Arrays.asList(array);


//        Arrays.setAll(array, i -> array[i].toUpperCase()  );
        list.replaceAll(s -> s.toUpperCase());
        list.replaceAll(s -> s += " " + (char) random.nextInt(65,92) + ".");
        list.replaceAll(s -> {
            var first = s.split(" ")[0];
            var reversed = new StringBuilder(first).reverse().toString();
            return s + " " + reversed;
        });

        List<String> newList = new ArrayList<>(list);
//        newList.removeIf(s -> {
//            var parts = s.split(" ");
//            var first = parts[0];
//            var last = parts[2];
//
//            return first.equals(last);
//        });

        //or
        newList.removeIf( s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") +1)));

        System.out.println(list);
        System.out.println("removed");
        System.out.println(newList);

        list.forEach(s -> System.out.println(s));

        System.out.println(Arrays.toString(array));
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int)startChar, (int)endChar + 1);
    }
}
