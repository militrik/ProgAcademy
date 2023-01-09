package homework.listdirs;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        listDirsInside("x:\\");
    }

    private static void listDirsInside(String path) {

        File f = new File(path);
        if (!f.exists() || !f.isDirectory()) {
            System.out.println("The directory \"" + path + "\" is not exist");
            return;
        }

        File[] files = f.listFiles();
        if (files != null) {
            if (files.length != 0) {
                System.out.println("List of directories:");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file);
                    }
                }
            } else {
                System.out.println("There are no any directory inside \"" + path + "\".");
            }
        }
    }

}
