package homework.charcodesum;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world";

        Function<String, Integer> pr1 = s -> {
            int sum = 0;
            for (char element : s.toCharArray()
            ) {
                sum = Integer.sum((int) element, sum);
            }
            return sum;
        };
        System.out.println(pr1.apply(text));
    }
}
