package homework.translator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Dictionary implements FileDataConverterInterface {
    private static File dictionaryENUAFile = new File("EN_UA.csv");
    private static File dictionaryUAENFile = new File("UA_EN.csv");


    public Dictionary() {

    }

    private static File getDictionaryFile(Langs direction) {
        File dictionaryFile = new File("");
        switch (direction) {
            case ENUA -> dictionaryFile = dictionaryENUAFile;
            case UAEN -> dictionaryFile = dictionaryUAENFile;
        }
        return dictionaryFile;
    }

    public static void fillDictionary(Langs direction, String left, String right) {
        Map<String, String> dictionary = new Dictionary().getDictionary(direction);
        dictionary.put(left, right);
        new Dictionary().writeDataToFile(dictionary, getDictionaryFile(direction));
    }

    public Map<String, String> getDictionary(Langs direction) {
        File dictionaryFile = getDictionaryFile(direction);
        Map<String, String> dictionary = readFileToData(dictionaryFile);
        return dictionary;
    }

    public Map.Entry<String, String> fromStringRepresentation(String str) {

        String[] strArray = str.split("[,]");
        Map.Entry<String, String> wordPair = new AbstractMap.SimpleEntry<String, String>(strArray[0], strArray[1]);
        return wordPair;
    }

    public String toStringRepresentation(Map.Entry<String, String> me) {
        return me.getKey() + "," + me.getValue() + System.lineSeparator();
    }

    @Override
    public Map<String, String> readFileToData(File file) {
        String text = "";
        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String temp = br.readLine();
                if (temp == null) {
                    break;
                }
                Map.Entry<String, String> wordPair = fromStringRepresentation(temp);
                dictionary.put(wordPair.getKey(), wordPair.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dictionary;
    }

    @Override
    public void writeDataToFile(Object object, File fileOut) {
        Map<String,String> dictionary = (Map<String,String>) object;
        Iterator<Map.Entry<String, String>> itr=dictionary.entrySet().iterator();
        String text = "";
        while (itr.hasNext()) {
            text +=  toStringRepresentation(itr.next());
        }
        try (Writer writer = new FileWriter(fileOut, StandardCharsets.UTF_8)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public enum Langs {
        ENUA, UAEN
    }


}
