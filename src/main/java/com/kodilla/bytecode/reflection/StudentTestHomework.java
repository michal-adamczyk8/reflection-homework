package com.kodilla.bytecode.reflection;

import java.lang.reflect.Field;

public class StudentTestHomework {

        public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
            Student student = new Student("Michał", "Adamczyk");
            Class<Student> descriptor = Student.class;
            Field indexNumberField = descriptor.getDeclaredField("indexNumber");
            indexNumberField.setAccessible(true);
            String indexNumber = (String) indexNumberField.get(student);
            System.out.println("Generated index number: " + indexNumber);
        }
}
