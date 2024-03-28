package at.stderr.Constructors;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
//        Account maxsAccount = new Account("Max Mustermann", "max@mustermann.com", "+43 12345" );
//        System.out.println(maxsAccount.getNumber());

        VipCustomer vip = new VipCustomer();
        System.out.println(vip);

        VipCustomer anotherVip = new VipCustomer("Hugo Habicht", "hugo@habicht.com");
        System.out.println(anotherVip);

        VipCustomer third = new VipCustomer(100.0, "Donald Duck", "donald@duck.com");
        System.out.println(third);
    }
}
