package com.levochka108.newphonebook.app.view;

import com.levochka108.newphonebook.app.Contact;
import com.levochka108.newphonebook.app.ContactStorage;
import com.levochka108.newphonebook.app.repository.ContactManager;
import com.levochka108.newphonebook.app.repository.FileContactStorage;

import java.util.List;
import java.util.Scanner;

public class ViewMenu {

    private static final String STORAGE_FILE_PATH = "contacts.csv";
    private static final Scanner scanner = new Scanner(System.in);
    private static ContactManager contactManager;
    private static ContactStorage contactStorage;

    public void mainMenu() {
        contactManager = new ContactManager();
        contactStorage = new FileContactStorage();

        loadContacts();

        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = readChoice();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> removeContact();
                case 3 -> updateContact();
                case 4 -> searchContacts();
                case 5 -> viewAllContacts();
                case 6 -> {
                    saveAndExit();
                    exit = true;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loadContacts() {
        List<Contact> contacts = contactStorage.importContacts(STORAGE_FILE_PATH);
        for (Contact contact : contacts) {
            contactManager.addContact(contact);
        }
    }

    private void saveContacts() {
        List<Contact> contacts = contactManager.getAllContacts();
        contactStorage.exportContacts(contacts, STORAGE_FILE_PATH);
    }

    private void printMenu() {
        System.out.println("\n--- Contact App Menu ---");
        System.out.println("1. Add Contact");
        System.out.println("2. Remove Contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Search Contacts");
        System.out.println("5. View All Contacts");
        System.out.println("6. Save and Exit");
        System.out.print("Enter your choice: ");
    }

    private int readChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber, email);
        contactManager.addContact(contact);
        System.out.println("Contact added successfully!");
    }

    private void removeContact() {
        System.out.print("Enter name or phone number to remove: ");
        String keyword = scanner.nextLine();
        List<Contact> searchResults = contactManager.searchContacts(keyword);
        if (searchResults.isEmpty()) {
            System.out.println("No contacts found with the given keyword.");
        } else if (searchResults.size() == 1) {
            Contact contact = searchResults.get(0);
            contactManager.removeContact(contact);
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Multiple contacts found. Please refine your search.");
        }
    }

    private void updateContact() {
        System.out.print("Enter name or phone number to update: ");
        String keyword = scanner.nextLine();
        List<Contact> searchResults = contactManager.searchContacts(keyword);
        if (searchResults.isEmpty()) {
            System.out.println("No contacts found with the given keyword.");
        } else if (searchResults.size() == 1) {
            Contact contact = searchResults.get(0);
            System.out.println("Enter new name (or press Enter to keep " + " + contact.getName() + " + "):");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                contact.setFullName(name);
            }
            System.out.println("Enter new phone number (or press Enter to keep " + " + contact.getPhoneNumber() + " + "):");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isEmpty()) {
                contact.setPhoneNumber(phoneNumber);
            }
            System.out.println("Enter new email (or press Enter to keep " + " + contact.getEmail() + " + "):");
            String email = scanner.nextLine();
            if (!email.isEmpty()) {
                contact.setEmail(email);
            }
            contactManager.updateContact(contact, contact);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Multiple contacts found. Please refine your search.");
        }
    }


    private void searchContacts() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();
        List<Contact> searchResults = contactManager.searchContacts(keyword);
        if (searchResults.isEmpty()) {
            System.out.println("No contacts found with the given keyword.");
        } else {
            System.out.println("Search results:");
            for (Contact contact : searchResults) {
                System.out.println(contact);
            }
        }
    }

    private void viewAllContacts() {
        List<Contact> contacts = contactManager.getAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("All contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private void saveAndExit() {
        saveContacts();
        System.out.println("Contacts saved to file. Exiting.");
    }


}


