package com.levochka108.newphonebook.app.randomcontact;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CsvFileGenerator {
    private static final String CSV_SEPARATOR = ",";

    public static void main(String[] args) {
        String filePath = "contacts.csv";
        generateCsvFile(filePath, 100);
        System.out.println("CSV-файл успешно создан: " + filePath);
    }

    public static void generateCsvFile(String filePath, int numContacts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < numContacts; i++) {
                String name = generateRandomName();
                String phoneNumber = generateRandomPhoneNumber();
                String email = generateRandomEmail();
                String line = name + CSV_SEPARATOR + phoneNumber + CSV_SEPARATOR + email;
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String generateRandomName() {
        String[] names = { "John", "Alice", "Michael", "Emma", "David", "Olivia", "James", "Sophia" };
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    public static String generateRandomEmail() {
        String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com" };
        Random random = new Random();
        String name = generateRandomName().toLowerCase();
        String domain = domains[random.nextInt(domains.length)];
        return name + "@" + domain;
    }
}
