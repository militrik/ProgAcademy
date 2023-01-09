package sample.format;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[] { "Alex", "Anastasia", "Olga", "Ira", "Oleg" };
        String fff = "kuku";

        for (int i = 0; i < names.length; i++) {
            String text = String.format(fff + " %s !", names[i]);
            System.out.println(text);
        }

    }
}