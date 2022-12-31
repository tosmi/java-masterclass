package at.stderr.MobilePhone;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        var phone = new MobilePhone("2139823");
        phone.addNewContact(new Contact("Toni", "1"));
        phone.addNewContact(new Contact("Max", "2"));
        phone.addNewContact(new Contact("Fritz", "2"));

        System.out.println("query:");
        System.out.println(phone.queryContact("Max"));

        phone.printContacts();
    }
}
