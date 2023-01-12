package homework.translator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class TranslatorLangLang implements FileDataConverterInterface {

    private File fileIn;
    private File fileOut;
    private Dictionary.Langs direction;

    public TranslatorLangLang(File fileIn, Dictionary.Langs direction) {
        this.fileIn = fileIn;
        this.direction = direction;
    }

    public File getFileIn() {
        return fileIn;
    }

    public File getFileOut() {
        return fileOut;
    }

    @Override
    public String readFileToData(File file) {

        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String temp = br.readLine();
                if (temp == null) {
                    break;
                }
                text += temp + System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }


    @Override
    public void writeDataToFile(Object object, File fileOut) {
        String text = (String) object;

        try (Writer writer = new FileWriter(fileOut, StandardCharsets.UTF_8)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void translator() {
        Map<String, String> dictionary = new Dictionary().getDictionary(direction);
        String textIn = readFileToData(fileIn);
        String[] words = textIn.split("\\W+");
        String textOut = "";
        for (String word : words) {
            String temp = dictionary.get(word.toLowerCase());
            if (temp == null) {
                textOut += word + " ";
            } else {
                textOut += temp + " ";
            }
        }
        System.out.println(textIn + textOut + System.lineSeparator());

        String fileOutTitle = (fileIn.getName().split("[.]"))[0];
        String fileOutExt = (fileIn.getName().split("[.]"))[1];
        String fileOutName = fileOutTitle + "_" + direction.toString() + "." + fileOutExt;
        fileOut = new File(fileOutName);
        writeDataToFile(textOut, fileOut);
    }


    public static class GroupFileStorageException extends Exception {
        public GroupFileStorageException(String message) {
            super(message);
        }
    }
}
