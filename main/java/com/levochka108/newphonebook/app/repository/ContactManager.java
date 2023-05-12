package com.levochka108.newphonebook.app.repository;

import com.levochka108.newphonebook.app.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
        }
    }

    public List<Contact> searchContacts(String keyword) {
        List<Contact> searchResult = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFullName().contains(keyword) || contact.getPhoneNumber().contains(keyword) || contact.getEmail().contains(keyword))
                searchResult.add(contact);
        }
        return searchResult;
    }
    public List<Contact> getAllContacts() {
        return contacts;
    }

}
