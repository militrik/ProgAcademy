package extrahomework.vovochka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String text = sc.nextLine();

        String word = "";
        for (int i = 0; i < text.length(); i++) {
            word = word + text.charAt(i);
            String[] result = text.split(word);
            if (result.length == 0) {
                System.out.println(word);
                break;
            }
        }
    }
}

