package homework.group;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Group gr1 = new Group("Junior");

        try {
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Dasia,Pupkin8,MALE,8,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Jasia,Pupkin6,MALE,6,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Tasia,Pupkin4,MALE,4,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Aasia,Pupkin2,MALE,2,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Pasia,Pupkin9,MALE,9,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Gasia,Pupkin7,MALE,7,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Nasia,Pupkin5,MALE,5,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Qasia,Pupkin3,MALE,3,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Wasia,Pupkin1,MALE,1,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Easia,Pupkin0,MALE,0,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Vasia,Pupkin11,MALE,11,Junior"));
        } catch (CSVStringConverter.CSVStringConverterException e) {
            System.out.println(e.getMessage());
        } catch (Group.GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr1);

        try {
            System.out.println(gr1.searchStudentByLastName("Pupkin0"));
        } catch (Group.StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr1.removeStudentByID(0));

        try {
            System.out.println(gr1.searchStudentByLastName("Pupkin0"));
        } catch (Group.StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr1);

        GroupFileStorage.saveGroupToCSV(gr1);

    }
}
