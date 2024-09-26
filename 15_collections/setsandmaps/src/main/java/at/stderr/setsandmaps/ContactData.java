package at.stderr.setsandmaps;

import java.util.*;
import java.util.stream.Collectors;

public class ContactData {
    private static String PhoneData = """
                Charlie Brown, 3334445555
                Maid Marion, 1234567890
                Mickey Mouse, 9998887777
                Mickey Mouse, 1247489758
                Minnie Mouse, 4567805666
                Robin Hood, 5647893000
                Robin Hood, 7899028222
                Lucy Van Pelt, 5642086852
                Mickey Mouse, 9998887777
                """;

    private static String EmailData = """
                Mickey Mouse, mckmouse@gmail.com
                Mickey Mouse, micky1@aws.com
                Minnie Mouse, minnie@verizon.net
                Robin Hood, robinhood@yahoo.com
                Linus Van Pelt, lvpelt@yahoo.com
                Daffy Duck, daffyduck@yahoo.com
                """;

    public static List<Contact> getData(String type) {
        List<Contact> contacts= new ArrayList<>();
        if ( type == "phone" ) {
             contacts = getPhoneData();
        } else if ( type == "email") {
            contacts = getEmailData();
        }

        return contacts;
    }

    private static List<Contact> getPhoneData() {
        List<Contact> contacts= new ArrayList<>();

        /*List<String> result = new Scanner(PhoneData)
                .useDelimiter("\n")
                .tokens()
                .forEach(s-> String[] parts = s.split(","); )
                .collect(Collectors.toList());
*/
        Scanner s = new Scanner(PhoneData);
        while ( s.hasNextLine() ) {
            String[] parts = s.nextLine().split(",");
            Arrays.asList(parts).replaceAll(String::trim);
            contacts.add(new Contact(parts[0], "", Long.parseLong(parts[1])));
        }
        return contacts;
    }

    private static List<Contact> getEmailData() {
        List<Contact> contacts= new ArrayList<>();
        Scanner s = new Scanner(EmailData);
        while ( s.hasNextLine() ) {
            String[] parts = s.nextLine().split(",");
            Arrays.asList(parts).replaceAll(String::trim);
            contacts.add(new Contact(parts[0], parts[1]));
        }
        return contacts;
    }
}
