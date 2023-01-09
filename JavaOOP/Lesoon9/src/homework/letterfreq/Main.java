package homework.letterfreq;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("TarasShevchenko_Dream.txt");
        String text;
        try {
            text = getStringFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(getStatistic(text)));

    }

    public static Map.Entry<Character, Integer>[] getStatistic(String text) {
        Map<Character, Integer> stat = new HashMap<>();
        text = text.toLowerCase();
        for (Character s : text.toCharArray()) {
            if (s >= 'a' && s <= 'z') {
                stat.merge(s, 1, Integer::sum);
            }
        }
        Map.Entry[] entries = stat.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(entries, new SortByUsage());
        return entries;
    }

    public static String getStringFromFile(File file) throws FileNotFoundException {
        String result = "";
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                result += sc.nextLine() + System.lineSeparator();
            }
        }
        return result.substring(0, result.length() - 1);
    }
}


