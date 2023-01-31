package homework.filesort;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String rootFolder = "./../Lesson/Stream API/";
        File[] fileList = new File(rootFolder).listFiles(File::isFile);

        Map<String, Map<String,Long>> result =
                Arrays.stream(Objects.requireNonNull(fileList)).collect(Collectors.groupingBy(
                        file -> {
                            if (file.length() < 100_000)
                                return "files < 100k";
                            else if (file.length() < 1000_000) {
                                return "100k < files < 1M";
                            } else if (file.length() < 10_000_000) {
                                return "100k < files < 10M";
                            } else {
                                return "10M < files";
                            }
                        }, Collectors.toMap(File::getName, File::length)
                ));
        System.out.println(result);
    }
}