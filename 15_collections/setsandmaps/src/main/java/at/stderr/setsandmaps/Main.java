package at.stderr.setsandmaps;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main( String[] args ) {
        Contact contact = new Contact("Toni Schmidbauer", "toni@stderr.at", 1234567890);
        System.out.println("contact: " + contact);

        Contact other = new Contact("Toni Schmidbauer", "toni@schmidbauer.cc", 1235555550);
        System.out.println("other: " + other);

        Contact franz = new Contact("Franz Schmidbauer", "toni@schmidbauer.cc", 876543211);
        System.out.println("other: " + franz);

        Contact merged = contact.mergeContactData(other);
        System.out.println("merged: " + merged);

        merged = merged.mergeContactData(franz);
        System.out.println("merged: " + merged);

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Email Data", emails);
        printData("Phone Data", phones);
    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("--------------------------------------");
        System.out.println(header);
        System.out.println("--------------------------------------");

        contacts.forEach(System.out::println);
    }
}
