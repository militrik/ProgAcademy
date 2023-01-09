package sample.scaner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] goods = new String[] { "Mars", "Kit-cat", "Snikers" };
        int[] price = new int[] { 30, 20, 30 };
        int[] count = new int[] { 30, 50, 70 };
        String del = ",";
        File file = new File("report.csv");
//    saveReport(file, del, goods, price, count);

        String text = getStringFromFile(file);
        System.out.println(text);
    }

    public static void saveReport(File file, String del, String[] g, int[] p, int[] c) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < c.length; i++) {
                pw.println(g[i] + del + p[i] + del + c[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getStringFromFile(File file) {
        String text = "";
        try (Scanner sc = new Scanner(file)) {

            for (; sc.hasNextLine();) {
                text += sc.nextLine() + System.lineSeparator();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}