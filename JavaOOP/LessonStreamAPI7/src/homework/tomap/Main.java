package homework.tomap;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Y","Hello", "666", "Java", "xXx", "word!");
        HashMap<Integer, String> integerStringHashMap = list.stream()
                .collect(HashMap::new, (hashMap, s) -> {
                    if (s.matches(".*(?i:[aeiouy])+?.*"))
                        hashMap.put(s.hashCode(), s);
                }, HashMap::putAll);
        System.out.println(integerStringHashMap);
    }
}
