package homework.interfaces;

public interface StringConverter {
    public String toStringRepresentation(Student student);

    public Student fromStringRepresentation(String str) throws CSVStringConverterException;
}
