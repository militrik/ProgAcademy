package homework.interfaces;

public class InvalidStudentInput extends Throwable{

    public InvalidStudentInput(String message) {
        super(message);
    }
}
