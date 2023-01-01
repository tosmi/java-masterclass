package at.stderr.VarArgs;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String... args ) {
        System.out.println("hello world");
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));
        printText("Hello");
        System.out.println("_".repeat(20));
        printText("Hello","World","again");
        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third"};
        printText(String.join(",", sArray));
    }

    // public static void printText(String[] textList) {
    public static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
