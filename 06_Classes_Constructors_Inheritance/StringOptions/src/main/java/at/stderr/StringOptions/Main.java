package at.stderr.StringOptions;

import javax.swing.plaf.basic.BasicButtonUI;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        String helloWorld = "Hello World";
        helloWorld.concat(" and goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + " World");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("StringBuilder capacity = " + builder.capacity());
    }
}
