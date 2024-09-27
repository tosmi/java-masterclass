package at.stderr.setsandmaps;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        if ( email != null ) {
            this.emails.add(email);
        }

        if ( phone > 0 ) {
            String phoneNumber = transformPhone(phone);
            if (phoneNumber != "unknown") {
                this.phones.add(transformPhone(phone));
            }
        }
    }

    private String transformPhone(long phone) {
        String transformedPhone;

        transformedPhone = transformPhoneString(phone);
        return transformedPhone;
    }

    private String transformPhoneScanner(long phone) {
        String transformedPhone;
        Scanner s = new Scanner( Long.toString(phone) );

        if ( s.findInLine("(\\d{3})(\\d{3})(\\d+)") == null ) {
            System.out.println("Could not transform phone: " + phone );
            return "unknown";
        }

        MatchResult r = s.match();
        transformedPhone = "(" + r.group(1) + ") " + r.group(2) + " " + r.group(3);

        System.out.println("phone: " + transformedPhone);
        return transformedPhone;
    }

    private String transformPhoneString(long phone) {
        String transformedPhone = String.valueOf(phone);
        transformedPhone = "(%s) %s %s".formatted(
                transformedPhone.substring(0,3),
                transformedPhone.substring(3,6),
                transformedPhone.substring(6));

        return transformedPhone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }

    public Contact mergeContactData(Contact other) {
        if ( !this.equals(other) ) {
            System.out.println("This is a different contact: " + other.getName());
        };

        Contact newContact = new Contact(this.name);
        //System.out.println("new: " + newContact);
        newContact.emails.addAll(this.emails);
        //System.out.println("new: " + newContact);
        newContact.phones.addAll(this.phones);
        newContact.emails.addAll(other.emails);
        newContact.phones.addAll(other.phones);

        return newContact;
    }

    /*@Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        return getName().equals(contact.getName());
    }

*/

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;

        return getName().equals(contact.getName());
    }

    @Override
    public int hashCode() {
        return 31 * getName().hashCode();
    }

    public void addEmail(String companyName) {
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length-1],
                companyName.replaceAll(" ", "").toLowerCase());
        if (!emails.add(email)) {
            System.out.println(name + " now already has email " + email);
        } else {
            System.out.println(name + " now has email " + email);
        }
    }

    public void replaceEmailIfExists(String oldEmail, String newEmail) {
        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }
}
