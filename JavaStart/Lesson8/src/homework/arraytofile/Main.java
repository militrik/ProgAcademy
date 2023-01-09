package homework.arraytofile;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        arrayInt2DToFile("1.txt", array);
    }

    public static void arrayInt2DToFile(String name, int[][] arr) {
        File myFile = new File("1.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter pw = new PrintWriter(myFile)) {
            for (int i = 0; i < arr.length; i++) {
                pw.println(Arrays.toString(arr[i]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
