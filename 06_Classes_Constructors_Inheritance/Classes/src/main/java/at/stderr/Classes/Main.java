package at.stderr.Classes;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("xCarerra");
        System.out.println("Model is " + porsche.getModel());

    }
}
