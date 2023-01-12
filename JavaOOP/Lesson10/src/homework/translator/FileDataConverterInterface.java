package homework.translator;

import java.io.File;

public interface FileDataConverterInterface {

    Object readFileToData(File file);

    void writeDataToFile(Object object, File File);

}
