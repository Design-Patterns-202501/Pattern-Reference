package com.patrones;

import com.patrones.entities.*;

public class App {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                                .setAge(18)
                                .setName("Sebastian")
                                .setCareer("Ing. Sistemas", 8)
                                .addPhone("123", "123", "12")
                                .build();
        System.out.println(student);
    }
}
