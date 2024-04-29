package at.stderr.minilambdachallenges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        var myString = "Mein Name ist Hase und ich weisz von nichts";

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        printTheParts.accept(myString);
        System.out.println("------");

        Consumer<String> lambdaConsumer = s -> {
          String[] parts = s.split(" ");
          for (String part : parts) {
              System.out.println(part);
          }
        };

        lambdaConsumer.accept(myString);

        Consumer <String> printWordForEach = s -> {
          List<String> parts = Arrays.asList(s.split(" "));
            // or
            // String[] parts = s.split(" ");
            // Arrays.asList(parts).forEach(...);
          parts.forEach(System.out::println);
        };

        printWordForEach.accept(myString);
        System.out.println("-------");

        UnaryOperator<String> everySecondCharLambda = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++) {
                if ( i % 2 == 0 ) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondCharLambda.apply("1234567890"));

        Function<String, String> everySecondCharFunction = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++) {
                if ( i % 2 == 0 ) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharFunction.apply("1234567890"));

        System.out.println(everySecondChar(everySecondCharFunction, "1234567890"));

        Supplier<String> getLove = () -> "I Love Java";
        String iLoveJava = getLove.get();
        System.out.println(iLoveJava);

    }

    public static String everySecondChar(Function<String, String> f, String source) {
        return f.apply(source);
    }
}
