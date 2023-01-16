package homework.ifsum;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        IntPredicate intPredicate = value -> {
            String s = Math.abs(value) + "";
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += (int) s.charAt(i);
            }
            return sum % 2 == 0;
        };

        int number103 = 103;
        System.out.println("Digits sum of number " + number103 + " is " + (intPredicate.test(number103) ? "even" : "odd"));
        int number102 = -102;
        System.out.println("Digits sum of number " + number102 + " is " + (intPredicate.test(number102) ? "even" : "odd"));

    }
}
