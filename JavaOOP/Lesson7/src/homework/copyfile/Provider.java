package homework.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Provider implements Runnable {
    private final Action action;

    private File file;

    public Provider(Action action, File file) throws FileNotFoundException {
        super();
        this.action = action;
        this.file = file;
    }

    @Override
    public synchronized void run() {

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[1024 * 2 * 2];
            double fileSize = (double) file.length();
            double progress = 0;
            System.out.println("Copying file " + file);
            double prevProgressBar = 0;
            while (true) {
                while (action.isTurn()) {
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int readBytes = fileInputStream.read(buffer);
                if (readBytes <= 0) {
                    break;
                }

                progress += readBytes;
                double temp = Math.round(progress * 20 / fileSize);
                if (temp > prevProgressBar) {

/*                    System.out.print("\033[H\033[2J");
                    System.out.flush();*/
                    Runtime.getRuntime().exec("clear");
                    System.out.print("\033\143");
                    System.out.print("*");
                    prevProgressBar = temp;
                }

                action.setValue(new BufferData(readBytes, buffer));
                action.setTurn(true);
                //notifyAll();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        action.setStop(true);
    }
}