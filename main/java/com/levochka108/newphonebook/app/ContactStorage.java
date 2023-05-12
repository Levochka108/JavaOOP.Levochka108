package com.levochka108.newphonebook.app;

import java.util.List;

public interface ContactStorage {
    List<Contact> importContacts(String filePath);
    void exportContacts(List<Contact> contacts, String filePath);
}
