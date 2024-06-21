package at.stderr.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld {
    private static int last_id = 1;
    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating PlainOld Object: id = " + id);
    }

}
public class Main 
{
    public static void main( String[] args ) {
        List<String> list = new ArrayList<>(List.of(
                "Anna", "Bob", "Chuck", "Dave"
        ));

        list.forEach(System.out::println);
        calculator((a,b) -> a + b, 10, 25);
        calculator(Integer::sum, 10, 25);
        calculator(Double::sum, 2.5, 7.5);

        // does not execute constructor, just stores reference to method
        Supplier<PlainOld> refercence1 = PlainOld::new;
        // this executes the construtor
        System.out.println("nothing happens...");
        PlainOld plainOld = refercence1.get();

        System.out.println("Getting array");
        PlainOld[] plainOldArray = seedArray(PlainOld::new, 10);

//        calculator((s1, s2) -> s1.concat(s2), "Hello ", "World");
        calculator(String::concat, "Hello ", "World");

        BinaryOperator<String> b1 = (s1,s2) -> s1.concat(s2);
        BiFunction<String, String, String> b2 = (s1,s2) -> s1.concat(s2);

        // BinaryOperator<String> b1 = String::concat;
        //BiFunction<String, String, String> b2 = String::concat;
        //UnaryOperator<String> u1 = String::concat;
        //UnaryOperator<String> u1 = (s1,s2) -> s1.concat(s2);
        UnaryOperator<String> u1 = (s1) -> s1.toUpperCase();

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello "));

        String result = "Hello World".transform(u1);
        System.out.println(result);

        result = result.transform(String::toLowerCase);
        System.out.println(result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean booleanResult = result.transform(f0);
        System.out.println(booleanResult);
    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result: " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> referenced, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array,i -> referenced.get());
        return array;
    }
}
