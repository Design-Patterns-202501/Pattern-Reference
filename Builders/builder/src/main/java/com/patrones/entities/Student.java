package com.patrones.entities;

import java.util.ArrayList;
import java.util.List;

import com.patrones.interfaces.IBuilder;

public class Student {

    private String name;
    private int age;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts;
    private Career career;

    private Student(String name, int age, String gender, Address address, List<Phone> phones, List<Contact> contacts, Career career) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
        this.career = career;
    }

    private Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Student = { " + this.name + ", " + this.career.getName() + " }";
    }

    public static class StudentBuilder implements IBuilder<Student> {
        private String name;
        private int age;
        private String gender;
        private Address address;
        private final List<Phone> phones = new ArrayList<>();
        private final List<Contact> contacts = new ArrayList<>();
        private Career career;

        public StudentBuilder() {
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setAddress(String address, String city, String country, String zone) {
            this.address = new Address(address, city, country, zone);
            return this;
        }

        public StudentBuilder addPhone(String number, String extention, String type) {
            this.phones.add(
                    new Phone(number, extention, type));
            return this;
        }

        public StudentBuilder addContact(String name, Phone phone, Address address) {
            this.contacts.add(
                    new Contact(name, phone, address)
                    );
            return this;
        }

        public StudentBuilder setCareer(String name, int semesters) {
            this.career = new Career(name, semesters);
            return this;
        }

        @Override
        public Student build() {
            return new Student(name, age, gender, address, phones, contacts, career);
        }
    }
};
