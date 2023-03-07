package org.example;

import java.util.Arrays;

public class Person {

    Recipient recipient;
    Details[] details;

    @Override
    public String toString() {
        return "Person{" +
                "recipient=" + recipient +
                ", detailsClass=" + Arrays.toString(details) +
                '}';
    }
}
