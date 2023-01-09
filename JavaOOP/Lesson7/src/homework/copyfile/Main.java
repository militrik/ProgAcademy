package homework.copyfile;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Action action = new Action();
        Provider provider = null;
        try {
            provider = new Provider(action, new File("big.original"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Receiver receiver = new Receiver(action, new File("big.copy"));
        Thread threadOne = new Thread(provider);
        Thread threadTwo = new Thread(receiver);
        threadOne.start();
        threadTwo.start();
    }
}