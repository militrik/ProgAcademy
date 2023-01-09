package homework.translator;

import java.io.File;

public interface FileDataConverter {

    Object readFileToData(File file);

    File writeDataToFile(Object object);

}
