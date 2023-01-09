package homework.translator;

import java.util.AbstractMap;
import java.util.Map;

public class CSVtoStringConverter implements CSVStringConverter {
/*    @Override
    public String toStringRepresentation(Student student) {

        if (student == null) {
            return "";
        } else {
            return student.getName() + "," + student.getLastName() + ","
                    + student.getGender() + "," + student.getId() + ","
                    + student.getGroupName() + System.lineSeparator();
        }
    }*/

    @Override
    public Map.Entry<String, String> fromStringRepresentation(String str) throws CSVStringConverterException {
        try {
            // Map.Entry<String,String> wordPair = new Map.Entry<String, String>();
            String[] strArray = str.split("[,]");
            Map.Entry<String, String> wordPair = new AbstractMap.SimpleEntry<String, String>(strArray[0], strArray[1]);
            return wordPair;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            throw new CSVStringConverterException("Invalid string");
        }

    }

    public class CSVStringConverterException extends Exception {
        public CSVStringConverterException(String message) {
            super(message);
        }
    }
}
