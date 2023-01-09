package homework.streamIO;

public interface StringConverter {
    public String toStringRepresentation(Student student);

    public Student fromStringRepresentation(String str) throws CSVStringConverter.CSVStringConverterException;
}
