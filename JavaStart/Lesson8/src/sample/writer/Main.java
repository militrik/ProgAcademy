package sample.writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String[] goods = new String[] { "Mars", "Kit-cat", "Snikers" };
        int[] price = new int[] { 30, 20, 30 };
        int[] count = new int[] { 30, 50, 70 };
        String del = ",";
        File file = new File("report.csv");
        saveReport(file, del, goods, price, count);
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

}