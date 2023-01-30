package homework.dirsthreefile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> folder3File = null;
        try {
            folder3File = Files.lines(Path.of("list.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Optional<File> stringOptional = folder3File
                .filter(s -> Objects.requireNonNull((new File(s)).list()).length > 3)
                .map(File::new)
                .findFirst();
        System.out.println(stringOptional.get());
    }
}