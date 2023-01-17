package homework.charcodesum;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world";

        Function<String, char[]> fun1 = String::toCharArray;

        Function<char[], Integer> fun2 = chars -> {
            int sum = 0;
            for (char element : chars
            ) {
                sum = Integer.sum((int) element, sum);
            }
            return sum;
        };

        Function<String, Integer> fun3 = fun2.compose(fun1);

        System.out.println(fun3.apply(text));
    }
}
