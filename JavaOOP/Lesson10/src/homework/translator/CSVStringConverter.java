package homework.translator;

public interface CSVStringConverter {
    //public String toStringRepresentation(Object obj);

    public Object fromStringRepresentation(String str) throws CSVtoStringConverter.CSVStringConverterException;
}
