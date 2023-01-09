package sample51;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {

    public static long copyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut)) {
            return is.transferTo(os);
        }
    }

    public static int copyFolder(File folderIn, File folderOut) throws IOException {

        if (!folderOut.exists())
            folderOut.createNewFile();
        File[] lst = folderIn.listFiles();
        int cnt=0;
        for (File element:lst
             ) {
            if (element.isFile()) {
                copyFile(element, new File(folderOut + "\\" + element.getName()));
                cnt++;
            }
        }

        return cnt;
    }


}