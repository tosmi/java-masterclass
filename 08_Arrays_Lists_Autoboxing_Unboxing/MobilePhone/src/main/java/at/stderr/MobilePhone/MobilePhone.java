package at.stderr.MobilePhone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact c) {
        boolean contactAdded = false;
        if (findContact(c) < 0) {
            myContacts.add(c);
            contactAdded = true;
        }

        return contactAdded;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean contactUpdated = false;

        int contactIndex = findContact(oldContact);
        if (contactIndex >= 0) {
            myContacts.set(contactIndex, newContact);
            contactUpdated = true;
        }

        return contactUpdated;
    }

    public boolean removeContact(Contact c) {
        boolean contactRemoved = false;

        int contactIndex = findContact(c);
        if (contactIndex >= 0) {
            myContacts.remove(contactIndex);
            contactRemoved = true;
        }

        return contactRemoved;
    }

    private int findContact(Contact c) {
        System.out.println("in findContact(Contact)");
        System.out.println(this.myContacts.indexOf(c));
        System.out.println(c);

        return findContact(c.getName());
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++ ) {
            if (name.equals( myContacts.get(i).getName() ))
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        return myContacts.get( findContact(name) );
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            System.out.println( (i+1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }
}
