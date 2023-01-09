package extrahomework.texttransformer;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String s = "hello";

        TextSaver ts1 = new TextSaver(new TextTransformer(), new File("TextTransformer.txt"));
        ts1.saveTextToFile(s);
        TextSaver ts2 = new TextSaver(new InverseTransformer(), new File("InverseTransformer.txt"));
        ts2.saveTextToFile(s);
        TextSaver ts3 = new TextSaver(new UpDownTransformer(), new File("UpDownTransformer.txt"));
        ts3.saveTextToFile(s);
    }
}
