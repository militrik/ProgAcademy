package sample.test3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        File file1 = new File("hello.txt");

        try (PrintWriter pw = new PrintWriter(file1)) {
            pw.println("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}