package sample.test;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        File file1 = new File("new file.odt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        File folder1 = new File("/home/alexander/Pictures/ABC");

        folder1.mkdirs();

        File workFolder = new File(".");
        File[] files = workFolder.listFiles();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            String fileType = "file";
            if (files[i].isDirectory()) {
                fileType = "folder";
            }
            long fileSize = files[i].length();
            System.out.println(fileName + "\t" + fileType + "\t" + fileSize);
        }
    }

}