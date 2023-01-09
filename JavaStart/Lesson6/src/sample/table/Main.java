package sample.table;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String csvText = "1000,2200,340\n" + "340,3450,200";
        int rows = csvText.split("[" + "\n" + "]").length;
        int cols = csvText.split("[" + "\n" + "]")[0].split("[,]").length;

        String[][] table = new String[rows][cols];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = csvText.split("[" + "\n" + "]")[i].split("[,]")[j];
            }
        }

        for (String[] strings : table) {
            System.out.println(Arrays.toString(strings));
        }
    }
}