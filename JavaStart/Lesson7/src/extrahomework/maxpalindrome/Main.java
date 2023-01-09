package extrahomework.maxpalindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getMaxPalindrome(3);
    }

    static public void getMaxPalindrome(int digits) {
        int maxValue = (int) Math.pow(10, digits);
        long maxPalindrome = 0;
        long mulLeft = 0;
        long mulRight = 0;

        for (long valueLeft = maxValue - 1; valueLeft > maxValue / 10; valueLeft--) {
            for (long valueRight = maxValue - 1; valueRight > maxValue / 10; valueRight--) {
                long result = valueLeft * valueRight;
                if (checkPalindrome(result)) {
                    //System.out.println(result + " = " + valueLeft + " + " + valueRight);
                    if (result > maxPalindrome) {
                        maxPalindrome = result;
                        mulLeft = valueLeft;
                        mulRight = valueRight;
                        //System.out.println(maxPalindrome + " = " + mulLeft + " + " + mulRight);
                    }
                }
            }
        }
        System.out.println(maxPalindrome + " = " + mulLeft + " + " + mulRight);
    }

    static public boolean checkPalindrome(long num) {
        String numString = String.format("%d", num);
        for (int i = 0; i < numString.length() / 2; i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
