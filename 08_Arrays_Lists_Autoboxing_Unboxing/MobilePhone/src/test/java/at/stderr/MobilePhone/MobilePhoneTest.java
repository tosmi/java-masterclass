package at.stderr.MobilePhone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {

    @Test
    void addContact() {
        MobilePhone phone = new MobilePhone("0664123456");
        assertTrue(phone.addNewContact(new Contact("Toni", "1")));
        assertEquals("Toni", phone.queryContact("Toni").getName());
    }

    @Test
    void updateContact() {
        MobilePhone phone = new MobilePhone("0664123456");

        var oldContact = new Contact("Toni", "1");
        var newContact = new Contact("Franz", "2");

        phone.addNewContact(oldContact);
        assertTrue(phone.updateContact(oldContact, newContact));
    }

    @Test
    void removeContact() {
        MobilePhone phone = new MobilePhone("0664123456");

        var contact = new Contact("Toni", "1");

        phone.addNewContact(contact);
        assertTrue(phone.removeContact(contact));
    }

    @Test
    void queryContact() {
        MobilePhone phone = new MobilePhone("0664123456");

        Contact c = new Contact("Toni", "1");
        phone.addNewContact(c);

        phone.addNewContact(new Contact("Max", "2"));

        assertEquals(c, phone.queryContact("Toni"));
    }
}