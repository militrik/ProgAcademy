package homework.interfaces;

import java.util.Scanner;

public class CreateStudent {
    static Scanner sc = new Scanner(System.in);

    public static Student create(Student student) throws InvalidStudentInput {
        try {
            System.out.println("Input name");
            student.setName(sc.nextLine());
            System.out.println("Input last name");
            student.setLastName(sc.nextLine());
            System.out.println("Input gender");
            student.setGender(Human.Gender.valueOf(sc.nextLine()));
            System.out.println("Input ID");
            student.setId(Integer.valueOf(sc.nextLine()));
            return student;
        } catch (IllegalArgumentException e) {
            throw new InvalidStudentInput("Invalid input");
        }
    }
}
