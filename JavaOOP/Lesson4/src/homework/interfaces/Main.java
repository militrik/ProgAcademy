package homework.interfaces;

public class Main {
    public static void main(String[] args) {

        Group gr1 = new Group("Junior");

        try {
            gr1.addStudent(CreateStudent.create(new Student()));
        } catch (InvalidStudentInput | GroupOverflowException e) {
            System.out.println(e.getMessage());
        }

        gr1.sortStudentsByLastName();
        System.out.println(gr1);

        System.out.println(new CSVStringConverter().toStringRepresentation(new Student()));

        try {
            System.out.println(new CSVStringConverter().fromStringRepresentation("Vasia,Pupkin,MALE,5,Junior"));
        } catch (CSVStringConverterException e) {
            System.out.println(e.getMessage());
        }
    }
}
