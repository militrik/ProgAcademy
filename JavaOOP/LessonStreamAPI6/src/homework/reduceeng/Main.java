package homework.reduceeng;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] textArr = "Hello Java world!".split(" ");

        Integer res = Arrays.stream(textArr)
                .filter(s -> s.length()>4)
                .parallel()
                .reduce(0, (s1, s2) -> s1 + s2.length(), Integer::sum);
        System.out.println(res);

    }
}

