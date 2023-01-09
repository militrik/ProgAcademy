package sample102;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Input text: ");
        text = sc.nextLine();
        System.out.println(getStatistic(text));
    }

    public static Map<Character, Integer> getStatistic(String text) {
        Map<Character, Integer> stat = new HashMap<>();
        text = text.toLowerCase();
        for (Character s : text.toCharArray()) {
            if (s >= 'a' && s <= 'z') {
                Integer n = stat.get(s);
                if (n == null) {
                    stat.put(s, 1);
                } else {
                    stat.put(s, n + 1);
                }
            }
        }
        return stat;
    }
}