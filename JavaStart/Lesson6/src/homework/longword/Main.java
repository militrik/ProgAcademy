package homework.longword;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String text = sc.nextLine();

        String[] result = text.split("[ ]");
        int maxI = 0;
        for (int tempMax = 0, i = 0; i < result.length; i++) {
            if (result[i].length() > tempMax) {
                tempMax = result[i].length();
                maxI = i;
            }
        }

        System.out.println("\nThe longer word is \"" + result[maxI] + "\" with "
                + result[maxI].length() + " letters." );
    }
}