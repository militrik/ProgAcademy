package extrahomework.money;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you have? Input in $.¢¢ format");
        String amount = "300200100,01";//*/sc.nextLine();

        String integerPart = (amount.split("[,]"))[0];
        String fractionalPart = (amount.split("[,]"))[1];

        integerPart = String.format("%09d", Integer.valueOf(integerPart));
        fractionalPart = String.format("%03d", Integer.valueOf(fractionalPart));

        System.out.println(
                "You have: "
                        + inThousandRange(integerPart.substring(0, 3))
                        + (Integer.valueOf(integerPart.substring(0, 3)) > 0 ? "million " : "")
                        + inThousandRange(integerPart.substring(3, 6))
                        + (Integer.valueOf(integerPart.substring(3, 6)) > 0 ? "thousand " : "")
                        + inThousandRange(integerPart.substring(6, 9))
                        + (Integer.valueOf(integerPart.substring(0, 9)) > 0 ? "dollars " : "")
                        + inThousandRange(fractionalPart)
                        + (Integer.valueOf(fractionalPart) > 0 ? "cents" : "")
        );
    }

    public static String inThousandRange(String integerPart) {
        String collectedString = "";
        String[][] semantics = {
                {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
                {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"},
        };

        int tens = 0;
        int ones = 0;
        tens = Integer.valueOf(integerPart.substring(integerPart.length() - 2, integerPart.length()));
        if (tens > 19) {
            tens = Integer.valueOf(integerPart.substring(integerPart.length() - 2, integerPart.length() - 1));
            collectedString = collectedString + semantics[1][tens] + " ";
            ones = Integer.valueOf(integerPart.substring(integerPart.length() - 1, integerPart.length()));
            collectedString = collectedString + semantics[0][ones] + " ";
        } else if (tens > 0) {
            tens = Integer.valueOf(integerPart.substring(integerPart.length() - 2, integerPart.length()));
            collectedString = collectedString + semantics[0][tens] + " ";
        } else ;
        int hundreds = Integer.valueOf(integerPart.substring(integerPart.length() - 3, integerPart.length() - 2));
        collectedString = semantics[0][hundreds] + (hundreds > 0 ? " hundred " : "") + collectedString;
        return collectedString;
    }
}

