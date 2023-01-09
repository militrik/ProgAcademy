package homework.circle;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // R^2=x^2+y^2
        Scanner sc = new Scanner(System.in);
        double radius = 4;

        System.out.println("Input X coordinate");
        double x = sc.nextDouble();
        x = Math.abs(x);

        System.out.println("Input Y coordinate");
        double y = sc.nextDouble();
        y = Math.abs(y);

        if (x > radius || y > radius)
            System.out.println("This point is out of circle");
        else {
            double calculatedY = Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
            double calculatedX= Math.sqrt(Math.pow(radius, 2) - Math.pow(y, 2));
            if (x > calculatedX || y > calculatedY)
                System.out.println("This point is out of circle");
            else
                System.out.println("This point is in of circle");
        }
    }
}
