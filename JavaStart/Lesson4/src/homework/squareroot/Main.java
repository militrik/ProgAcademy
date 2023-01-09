package homework.squareroot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        double a = sc.nextDouble();
        double x0 = a;
        double epsilon = 0.000000001;
        double x1;
        double d;
        do {
            x1 = 0.5 * (x0 + a / x0);
            d = x0 > x1 ? x0 - x1 : x1 - x0;
            x0 = x1;
        } while (d > 2 * epsilon && d * d > 2 * epsilon);
        System.out.println("Square root from " + a + " is " + x1);
    }
}



