package at.stderr.AllAboutStrings;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        // start searching at index n
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower))
            System.out.println("Values match exactly");

        if (helloWorld.equalsIgnoreCase(helloWorldLower))
            System.out.println("Values match ignoring case");

        if (helloWorld.startsWith("Hello"))
            System.out.println("Starts with Hello");

        if (helloWorld.endsWith("World"))
            System.out.println("Starts ends with World");

        if (helloWorld.contains("World"))
            System.out.println("Starts with World");

        // contentEquals also supports StringBuilder
        if (helloWorld.contentEquals("Hello World"))
            System.out.println("Values match exactly");

    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Lenght = %d %n", length);

        if(string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()) {
            System.out.println("String is blank");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
