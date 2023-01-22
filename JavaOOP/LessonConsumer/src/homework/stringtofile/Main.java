package homework.stringtofile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, File> bcons = (s, file) -> {
            try {
                Files.writeString(
                        Path.of(file.getPath()),
                        s + System.lineSeparator(),
                        StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        bcons.accept("1", new File("1.txt"));
    }
}
