package homework.delstring;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "housE", "cat0", "anker", "T", "cat1",
                "flower", "FAT32", "cat2", "cat3", "cat4")
        );
        System.out.println(list);

        list.removeIf(s -> s.toLowerCase().startsWith("f"));
        System.out.println(list);

        char[] remArr = {'h', 'a', 't'};
        list.removeIf(s -> {
            for (char element : remArr
            ) {
                if (s.toLowerCase().startsWith(element+""))
                    return true;
            }
            return false;
        });
        System.out.println(list);

    }
}
