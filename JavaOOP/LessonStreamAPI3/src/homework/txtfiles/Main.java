package homework.txtfiles;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> stringStream = Arrays.stream(Objects.requireNonNull(new File(".").listFiles(File::isFile)))
                .map(File::getName)
                .filter(s -> s.endsWith(".txt"))
                .toList();
    }
}
