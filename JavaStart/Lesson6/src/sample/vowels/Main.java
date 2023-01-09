package sample.vowels;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String text = sc.nextLine();

        String vowels = "aeyiou";

        String tempText = text.toLowerCase();
        int n = 0;
        char[] symbols = tempText.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (vowels.indexOf("" + symbols[i]) != -1) {
                n = n + 1;
            }
        }
        System.out.println(n);

    }
}