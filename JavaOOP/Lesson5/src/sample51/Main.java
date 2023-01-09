package sample51;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
/*        // TODO Auto-generated method stub
        File fileIn = new File("D:\\Magnus\\LOGO\\militrik.png");

        File fileOut = new File(fileIn.getName());

        try {
            System.out.println(FileService.copyFile(fileIn, fileOut));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        File folderIn = new File("D:\\Magnus\\LOGO\\");

        File folderOut = new File("111");

        folderOut.mkdirs();

        try {
            System.out.println(FileService.copyFolder(folderIn, folderOut) + " files copy");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}