package at.stderr.setsandmaps;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, "unknown");

    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, String email, long phone) {
        this.name = name;
        this.emails.add(email);
        this.phones.add(transformPhone(phone));
    }

    private String transformPhone(long phone) {
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
        return other;
    }
}
