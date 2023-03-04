package org.example;

public class Recipient {
    String name;
    Integer phone;

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}