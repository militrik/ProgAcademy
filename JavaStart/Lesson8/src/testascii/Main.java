package testascii;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File fl = new File("ASCIIflag.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of a flag: ");
        double sz = sc.nextInt();
        double sqr = sz / 2.5;
        int sqrtemp = (int) (sqr);
        flagFilePrinter(sz, sqrtemp, fl);

    }

    public static void flagFilePrinter(double a, double b, File c) {
        try (PrintWriter pw = new PrintWriter(c)) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if ((i * j <= Math.pow(b, 2) && j < b + 1 && i < b + 1)) {
                        pw.print("***");
                    } else if (i % 2 == 0) {
                        pw.print("000");
                    } else {
                        pw.print("___");
                    }
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}