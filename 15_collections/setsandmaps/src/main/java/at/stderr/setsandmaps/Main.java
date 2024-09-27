package at.stderr.setsandmaps;

import java.util.*;

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

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emails);
        unionAB.addAll(phones);
        printData("(A ∪ B) Union of Email (A) and Phone (B)", unionAB);

        Set<Contact> intersectionAB = new HashSet<>(emailContacts);
        intersectionAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersection of Email (A) and Phone (B)", intersectionAB);

        Set<Contact> intersectionBA= new HashSet<>(phoneContacts);
        intersectionBA.retainAll(emailContacts);
        printData("(B ∩ A) Intersection of phones (B) and emails (A)", intersectionBA);

        Set<Contact> AminusB = new HashSet<>(emailContacts);
        AminusB.removeAll(phoneContacts);
        printData("(A - B) Email (A) minus  Phone (B)", AminusB);
        
        Set<Contact> BminusA = new HashSet<>(phoneContacts);
        BminusA.removeAll(emailContacts);
        printData("(B - A) Phone (B) minus  Email (A)", BminusA);

        Set<Contact> symmetricDiff = new HashSet<>(AminusB);
        symmetricDiff.addAll(BminusA);
        printData("Symmetric Difference phones and emails", symmetricDiff);

        Set<Contact> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectionAB);
        printData("Symmetric Difference phones and emails", symmetricDiff2);


    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("--------------------------------------");
        System.out.println(header);
        System.out.println("--------------------------------------");

        contacts.forEach(System.out::println);
    }
}
