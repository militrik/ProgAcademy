package homework.sortfilepunktmark;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;


public class Main {
    public static void main(String[] args) {
        File[] files = new File(".").listFiles((file, s) -> s.endsWith(".txt") && !file.isFile());
        List<File> listFiles = Arrays.asList(Objects.requireNonNull(files));
        System.out.println(listFiles);

        ToIntFunction<File> fun = a -> {
            String text;
            try {
                text = Files.readString(Path.of(a.getPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return text.length() - text.replaceAll("[ ,.?!-]", "").length();
        };
        Comparator<File> resultComp = Comparator.comparingInt(fun);
        listFiles.sort(resultComp);
        System.out.println(listFiles);
    }
}
