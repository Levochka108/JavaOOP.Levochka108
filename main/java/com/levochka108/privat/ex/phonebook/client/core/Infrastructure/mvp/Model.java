package com.levochka108.privat.ex.phonebook.client.core.Infrastructure.mvp;

import com.levochka108.privat.ex.phonebook.client.core.Infrastructure.Phonebook;
import com.levochka108.privat.ex.phonebook.client.core.Infrastructure.models.Contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Model {
    Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            // ???...
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}