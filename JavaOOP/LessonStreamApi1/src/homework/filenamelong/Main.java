package homework.filenamelong;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        File[] files = new File(".").listFiles(File::isFile);
        if (files != null) {
            System.out.println(
                    Arrays.stream(files)
                    .max(Comparator.comparingInt(file -> file.getPath().length()))
                    .get()
            );
        }
    }
}