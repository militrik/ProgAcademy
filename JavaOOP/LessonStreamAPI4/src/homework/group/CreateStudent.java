package homework.group;

import java.util.Scanner;

public class CreateStudent {
    static Scanner sc = new Scanner(System.in);

    public  static Student create(Student student) throws InvalidStudentInputException {
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
            throw new InvalidStudentInputException("Invalid input");
        }
    }


    public static class InvalidStudentInputException extends Exception {
        public InvalidStudentInputException(String message) {
            super(message);
        }
    }
}
