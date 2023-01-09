package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w;

        while (true) {
            System.out.println("Input width (odd number): ");
            w = scanner.nextInt();
            if (w % 2 == 0) {
                System.out.println("Error! Input odd number.");
            } else {
                break;
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {

                if (i < w / 2 + 1) {
                    if (j < i || (i + j) >= w) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if ((i + j) < w - 1 || (i - j) < 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}