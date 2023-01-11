package homework.translator;

import java.io.*;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class CSVtoMapEntryConverter implements CSVConverterInterface, FileDataConverterInterface {
    public CSVtoMapEntryConverter() {
    }

    @Override
    public Map.Entry<String, String> fromStringRepresentation(String str) {

        String[] strArray = str.split("[,]");
        Map.Entry<String, String> wordPair = new AbstractMap.SimpleEntry<String, String>(strArray[0], strArray[1]);
        return wordPair;
    }

    @Override
    public String toStringRepresentation(Object obj) {
        return null;
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
    public File writeDataToFile(Object object) {
        return null;
    }
}