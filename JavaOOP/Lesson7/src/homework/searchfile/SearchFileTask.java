package homework.searchfile;

import java.io.File;

public class SearchFileTask implements Runnable {
    File folder;
    File file;

    public SearchFileTask(File folder, File file) {
        this.folder = folder;
        this.file = file;
    }

    @Override
    public void run() {
        {
            File[] listFiles = folder.listFiles();

            for (File element : listFiles
            ) {
                if (element.isFile()) {
                    if (file.getName().equals(element.getName())) {
                        System.out.println("The file " + file.getName() + " was find in " + element.getAbsolutePath());
                    }
                } else {
                    SearchFileTask searchFileTask;
                    searchFileTask = new SearchFileTask(element, file);
                    Thread thread = new Thread(searchFileTask);
                    thread.start();

                }
            }
        }
    }
}
