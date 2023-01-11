package homework.translator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class TranslatorLangLang implements FileDataConverterInterface {

    private static File dictionaryENUAFile = new File("EN_UA.csv");
    private static File dictionaryUAENFile = new File("UA_EN.csv");
    private Langs direction;

    private File fileIn;
    private File fileOut;

    public TranslatorLangLang(File fileIn, Langs direction) {
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
    public File writeDataToFile(Object object) {
        String text = (String) object;
        String fileOutTitle = (fileIn.getName().split("[.]"))[0];
        String fileOutExt = (fileIn.getName().split("[.]"))[1];
        String fileOutName = fileOutTitle + "_" + direction.toString() + "." + fileOutExt;
        File fileOut = new File(fileOutName);
        try (Writer writer = new FileWriter(fileOut, StandardCharsets.UTF_8)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileOut;
    }

    public void translator() {
        String textIn = readFileToData(fileIn);
        File dictionaryFile = new File("");
        switch (direction) {
            case ENUA -> dictionaryFile = dictionaryENUAFile;
            case UAEN -> dictionaryFile = dictionaryUAENFile;
        }
        Map<String, String> dictionary = new CSVtoMapEntryConverter().readFileToData(dictionaryFile);

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
        fileOut = writeDataToFile(textOut);
    }

    public enum Langs {
        ENUA, UAEN
    }

    public static class GroupFileStorageException extends Exception {
        public GroupFileStorageException(String message) {
            super(message);
        }
    }
}
