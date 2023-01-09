package homework.searchfile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("/home/militrik/Документи/ProgAcademy/JavaOOP");
        File file = new File("Main.java");

        SearchFileTask searchFileTask;
        searchFileTask = new SearchFileTask(folder, file );
        Thread thread  = new Thread(searchFileTask);
        thread.start();


    }
}
