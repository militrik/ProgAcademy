package sample.test4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File fileInfo = new File("folders.txt");
        File folder1 = new File(".");

//    saveFilderInfo(fileInfo, folder1);

        System.out.println(loadStringfromFile(fileInfo));
    }

    // Записать в файл адрес которого выступает первым параметром, список каталогов
    // расположенных в каталоге адрес которого выступает вторым параметром
    public static void saveFilderInfo(File file, File folder) {
        try (PrintWriter pw = new PrintWriter(file)) {
            File[] files = folder.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    pw.println(files[i]);
                }
            }
        } catch (IOException e) {
            // TODO: handle exception
        }
    }

    public static String loadStringfromFile(File file) {
        String text = "";
        try (Scanner sc = new Scanner(file)) {

            for (; sc.hasNextLine();) {
                text += sc.nextLine() + System.lineSeparator();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}