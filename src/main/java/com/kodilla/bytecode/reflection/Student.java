package com.kodilla.bytecode.reflection;

import java.util.Random;

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = generateRandomText();
    }

    private String generateRandomText() {
        Random random = new Random();
        int left = 48;
        int right = 122;
        int length = 10;

        return random.ints(left, right + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
