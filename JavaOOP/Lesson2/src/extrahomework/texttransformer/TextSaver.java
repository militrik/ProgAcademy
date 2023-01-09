package extrahomework.texttransformer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
    private File file;
    private TextTransformer transformer;

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public TextSaver() {
    }

    public void saveTextToFile(String text) {
        try (PrintWriter pw = new PrintWriter(file)) {
            file.createNewFile();
            pw.println(transformer.transform(text));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
