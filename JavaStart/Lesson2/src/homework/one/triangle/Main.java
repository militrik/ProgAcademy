package homework.one.triangle;

public class Main {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double halfPerimeter = (sideA + sideB + sideC);
        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

        System.out.println("The area of triangle is " + triangleArea);
    }
}
