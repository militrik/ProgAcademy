package com.gmail.simakarenko93;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text in 'AAA' format: ");

        String text = sc.nextLine();
        ASCII ascii = new ASCII();
        ascii.printArt(text);

    }

}