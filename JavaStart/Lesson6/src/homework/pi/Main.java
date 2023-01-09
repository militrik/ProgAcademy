package homework.pi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 12; i++) {
            System.out.println(String.format("%." + i + "f", Math.PI));
        }

    }
}