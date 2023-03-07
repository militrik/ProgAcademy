package com.example.lesson2;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private int id;


    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    public Customer(String name, String surname, int age, Gender gender, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
