package at.stderr.setsandmaps;

public class Main
{
    public static void main( String[] args ) {
        Contact c = new Contact("Toni Schmidbauer", "toni@stderr.at", 1234567890);
        System.out.println(c);
        c = new Contact("Toni Schmidbauer", "toni@stderr.at", 1);
        System.out.println(c);
    }
}
