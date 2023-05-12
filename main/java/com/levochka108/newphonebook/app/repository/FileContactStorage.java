package com.levochka108.newphonebook.app.repository;

import com.levochka108.newphonebook.app.Contact;
import com.levochka108.newphonebook.app.ContactStorage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileContactStorage implements ContactStorage {
    private static final String CSV_SEPARATOR = ",";

    @Override
    public List<Contact> importContacts(String filePath) {
        List<Contact> contacts = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(CSV_SEPARATOR);
                if (parts.length == 3) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    String email = parts[2];
                    Contact contact = new Contact(name, phoneNumber, email);
                    contacts.add(contact);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contacts;
    }

    @Override
    public void exportContacts(List<Contact> contacts, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Contact contact : contacts) {
                String line = contact.getFullName() + CSV_SEPARATOR +
                        contact.getPhoneNumber() + CSV_SEPARATOR +
                        contact.getEmail();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
