package extrahomework.letterfrequency;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long start1 = System.nanoTime();
        letterFrequency("TarasShevchenko_Dream.txt");
        //letterFrequency("WarandPeace_LevTolstoi.txt");
        System.out.println((double)(System.nanoTime()-start1)/1000000000.0);

    }

    public static void letterFrequency(String s) {
        File file = new File(s);
        if (!file.exists()) {
            return;
        }
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String text = getStringFromFile(file).toLowerCase();

        int[] freqs = new int[alphabet.length];

        for (int i = 0; i < alphabet.length; i++) {
            String[] splits = text.split("[" + alphabet[i] + "]");
            freqs[i] = (splits.length - 1);
            text = String.join("", splits);
        }

        sortBoubleTwoArraySynchronously(freqs, alphabet);
        System.out.println(s);
        System.out.println("Letter" + "\t-\t" + "frequency");
        for (int i = freqs.length - 1; i >= 0; i--) {
            System.out.println(alphabet[i] + "\t\t-\t\t" + freqs[i]);
        }
    }

    public static void sortBoubleTwoArraySynchronously(int[] majorArr, char[] minorArr) {
        int sortedIndex = majorArr.length;
        int numberOfSwap;
        do {
            numberOfSwap = 0;
            for (int i = 0; i < sortedIndex - 1; i++) {
                if (majorArr[i] > majorArr[i + 1]) {
                    swapInArray(majorArr, i, i + 1);
                    swapInArray(minorArr, i, i + 1);
                    numberOfSwap++;
                }
            }
        } while (numberOfSwap > 0);
    }

    public static void swapInArray(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static void swapInArray(char[] arr, int i, int i1) {
        char temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static String getStringFromFile(File file) {
        String result = "";
        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()) {
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.substring(0, result.length() - 1);
    }

}

