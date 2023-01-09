package sample.test2;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        File file1 = new File("new file.txt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        File folder1 = new File("AAAAAAAA");
        folder1.mkdirs();

        File file2 = new File(folder1, "b.docx");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        file1.delete();
        file2.delete();
        folder1.delete();

        File workFolder = new File(".");
        File[] files = workFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            long fileSize = files[i].length();
            String fileType = "File";
            if (files[i].isDirectory()) {
                fileType = "Folder";
            }
            System.out.println(fileName + "\t" + fileSize + "\t" + fileType);
        }

    }

}