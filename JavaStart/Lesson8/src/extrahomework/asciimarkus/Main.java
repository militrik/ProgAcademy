package extrahomework.asciimarkus;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        File importedtext = new File("WarandPeace_LevTolstoi.txt");
        String text = getStringFromFile(importedtext).toLowerCase();
        int[] counts = letterCount(text);
        //System.out.println(text);

        System.lineSeparator();
        String[] result = finalResult(counts);

        printing(result);
        System.out.println((double)(System.nanoTime()-start1)/1000000000.0);
    }

    public static String[] finalResult(int[] count) {
        String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] finalres = new String[count.length];
        String end = "";
        int max = count[0];

        for (int i = 0, k=0; i < count.length; i++) {
            for (int j = count.length - 1; j >= 0; j--) {
                if (count[j] >= max) {
                    max = count[j];
                    k = j;
                }
            }
            end = (count[k] != 1) ? "s" : "";
            finalres[i] = "Letter "+ alphabet[k] + " apeears " + count[k] + " time" + end;
            count[k] = -1;
            max = 0;
        }
        return finalres;
    }

    public static int[] letterCount(String text) {
        int[] letters = new int['z' - 'a' + 1];
        char[] line = text.toCharArray();
        int count = 0;
        for (int j = 'a', k = 0; k < 'z' - 'a' + 1; j++, k++) {
            for (int i = 0; i < text.length(); i++) {
                if (line[i] == j) {
                    count++;
                }
            }
            letters[k] = count;
            count = 0;
        }
        return letters;

    }

    public static String getStringFromFile(File fileText) {
        String text = "";

        try (Scanner sc = new Scanner(fileText)) {
            for (; sc.hasNextLine();) {
                text = text + sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.substring(0, text.length() - 1);
    }

    public static void printing (String [] result) {
        String resultText = "";
        for (int i = 0; i < result.length; i++) {
            resultText = result[i];
            System.out.println(resultText);
        }
    }
}