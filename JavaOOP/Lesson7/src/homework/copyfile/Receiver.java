package homework.copyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Receiver implements Runnable {
    private Action action;

    private File file;

    public Receiver(Action action, File file) {
        super();
        this.action = action;
        this.file = file;
    }

    @Override
    public synchronized void run() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {

            while (true) {
                while (!action.isTurn()) {
                    try {
                        wait(10);
                    } catch (InterruptedException e) {
                    }
                    if (action.isStop()){
                        System.out.println();
                        System.out.println("Done");
                        return;
                    }

                }
                BufferData bufferData = action.getValue();
                fileOutputStream.write(bufferData.getBuffer(), 0, bufferData.getReadBytes());
                action.setTurn(false);
                //notifyAll();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
