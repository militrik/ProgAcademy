package homework.stringnum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of(
                "Java",
                "world",
                "plus100500",
                "21Century",
                "lol"
        );
        List<String> list2 = new ArrayList<>();

        Consumer<String> cons = s -> {
            if(s.matches(".*\\d+.*"))
                list2.add(s);
        };

        list1.forEach(cons);
        System.out.println(list2);
    }
}
