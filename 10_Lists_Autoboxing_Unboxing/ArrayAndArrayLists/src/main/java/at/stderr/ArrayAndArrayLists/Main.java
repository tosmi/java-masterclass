package at.stderr.ArrayAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        String[] orignalArray = {"First", "Second", "Third"};
        var originalList = Arrays.asList(orignalArray);

        System.out.println(originalList);

        originalList.set(0, "one");

        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(orignalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(orignalArray));

        // does not work
        // originalList.add("bla");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        // List<String> newMutableList = List.of("Sunday", "Monday", "Tuesday");
        var newMutableList = List.of("Sunday", "Monday", "Tuesday");
        // does not work list is immutable
        // newMutableList.set(0, "Wednesday");
        System.out.println(newMutableList);

        ArrayList<String> stringList = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringList.toArray(new String[0]);

        System.out.println(Arrays.toString(stringArray));
    }
}
