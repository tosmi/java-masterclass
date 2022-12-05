package at.stderr.Interfaces;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(348);
        timsPhone.powerOn();
        timsPhone.callPhone(348);
        timsPhone.answer();
    }
}
