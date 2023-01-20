package homework.sortfilepunktmark;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File[] files = new File(".").listFiles((file, s) -> s.endsWith(".txt") && !file.isFile());
        List<File> listFiles = Arrays.asList(Objects.requireNonNull(files));
/*        Comparator<File> comp1 = (o1, o2) -> {
            o1.
        };*//*
        listFiles.sort(comp1);*/
    }
}
