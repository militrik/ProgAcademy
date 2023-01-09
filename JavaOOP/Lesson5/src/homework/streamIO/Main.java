package homework.streamIO;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Group gr1 = new Group("Junior");

        try {
            gr1.addStudent(CreateStudent.create(new Student()));
            gr1.addStudent(CreateStudent.create(new Student()));
            gr1.addStudent(CreateStudent.create(new Student()));
        } catch (CreateStudent.InvalidStudentInputException | Group.GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        gr1.sortStudentsByLastName();
        System.out.println(gr1);

        System.out.println(new CSVStringConverter().toStringRepresentation(new Student()));

        try {
            System.out.println(new CSVStringConverter().fromStringRepresentation("Vasia,Pupkin,MALE,5,Junior"));
        } catch (CSVStringConverter.CSVStringConverterException e) {
            System.out.println(e.getMessage());
        }

        try {
            new GroupFileStorage().saveGroupToCSV(gr1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            File gr2File = new GroupFileStorage().findFileByGroupName("Junior", new File("."));
            Group gr2 = new GroupFileStorage().loadGroupFromCSV(gr2File);
        } catch (GroupFileStorage.GroupFileStorageException e) {
            System.out.println(e.getMessage());
        }

    }
}
