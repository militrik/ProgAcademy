package homework.translator;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        Translate enua = new Translate(new File("A_good_boy.txt"));
        enua.translatorENUA();
    }
}
