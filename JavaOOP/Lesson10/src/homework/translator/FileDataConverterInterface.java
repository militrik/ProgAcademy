package homework.translator;

import java.io.File;

public interface FileDataConverterInterface {

    Object readFileToData(File file);

    File writeDataToFile(Object object);

}
