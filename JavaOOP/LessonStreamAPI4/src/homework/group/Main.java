package homework.group;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Group gr1 = new Group("Junior");

        try {
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Dasia,Pupkin8,MALE,16,8,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Jasia,Pupkin6,MALE,18,6,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Tasia,Pupkin4,MALE,24,4,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Aasia,Pupkin2,MALE,34,2,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Pasia,Pupkin9,MALE,21,9,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Gasia,Pupkin7,MALE,19,7,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Nasia,Pupkin5,MALE,20,5,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Qasia,Pupkin3,MALE,20,3,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Wasia,Pupkin1,MALE,19,1,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Easia,Pupkin0,MALE,60,0,Junior"));
            gr1.addStudent(new CSVStringConverter().fromStringRepresentation("Vasia,Pupkin11,MALE,17,11,Junior"));
        } catch (CSVStringConverter.CSVStringConverterException e) {
            System.out.println(e.getMessage());
        } catch (Group.GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        Set<Student> studentSortedSet = gr1.getStudens();

        List<Student> studentList = studentSortedSet.stream()
                .filter(student -> student.getAge() > 20)
                .sorted(Comparator.comparing(Human::getLastName))
                .toList();
        System.out.println(studentList);
    }
}
