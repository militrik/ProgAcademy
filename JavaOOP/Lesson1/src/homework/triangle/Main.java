package homework.triangle;

public class Main {
    public static void main(String[] args) {

        Triangle trg1 = new Triangle("triangle #1", 2.05, 54.54, 54.45);
        Triangle trg2 = new Triangle("triangle #2", 454, 0, 22);
        trg2.setB(500);

        System.out.println("The area of " + trg1.getName() + " is " + trg1.Area());
        System.out.println("The area of " + trg2.getName() + " is " + trg2.Area());
    }
}
