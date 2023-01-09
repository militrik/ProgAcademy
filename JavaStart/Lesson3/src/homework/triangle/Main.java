package homework.triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // R^2=x^2+y^2
        Scanner sc = new Scanner(System.in);
        double aX = 0;
        double aY = 0;
        double bX = 4;
        double bY = 4;
        double cX = 6;
        double cY = 1;

        System.out.println("Input X coordinate");
        double x = sc.nextDouble();
        x = Math.abs(x);

        System.out.println("Input Y coordinate");
        double y = sc.nextDouble();
        y = Math.abs(y);

        /*
        y = kx+b
        k = (y1-y2)/(x1-x2)
        b = y - kx
         */

        /*
        Принцип рішення задачі полягає в тому , що перетин прямої через точку та вершину
         та протилежної сторони трикутника повинен бути в межах координат вершин цієї сторони.
         */

        /*
        Рівняння для сторін , що створюють трикутник
         */
        double kAB = (aY - bY) / (aX - bX);
        double bAB = aY - kAB * aX;


        double kBC = (bY - cY) / (bX - cX);
        double bBC = bY - kBC * bX;

        double kCA = (cY - aY) / (cX - aX);
        double bCA = cY - kCA * cX;

        /*
        Рівняння для прямих, через точку P та вершини трикутника ABC
         */
        double kAP = (aY - y) / (aX - x);
        double bAP = aY - kAP * aX;

        double kBP = (bY - y) / (bX - x);
        double bBP = bY - kBP * bX;

        double kCP = (cY - y) / (cX - x);
        double bCP = cY - kCP * cX;


        /*
        Точка перетина прямих та протилежної сторони
        k1*x+b1=k2*x+b2
        x = (b2-b1)/(k1-k2)
        y = k1*x+b1
         */

        double xCrossAPandBC = (bBC - bAP) / (kAP - kBC);
        double yCrossAPandBC = kAP * xCrossAPandBC + bAP;

        double xCrossCPandAB = (bAB - bCP) / (kCP - kAB);
        double yCrossCPandAB = kCP * xCrossCPandAB + bCP;

        double xCrossBPandCA = (bCA - bBP) / (kBP - kCA);
        double yCrossBPandCA = kBP * xCrossBPandCA + bBP;

        /*
        Перевірка чи належить точка перетину вершині трикутника.
        Для точки, що всередені трикутника, всі повинні належати.
        Інакше точка поза трикутником.
         */
        if (xCrossAPandBC <= Math.min(bX, cX) || xCrossAPandBC >= Math.max(bX, cX))
            System.out.println("This point is out of triangle");
        else if (xCrossCPandAB <= Math.min(aX, bX) || xCrossAPandBC >= Math.max(aX, bX))
            System.out.println("This point is out of triangle");
        else if (xCrossBPandCA <= Math.min(cX, aX) || xCrossAPandBC >= Math.max(cX, aX))
            System.out.println("This point is out of triangle");
        else if (yCrossAPandBC <= Math.min(bY, cY) || xCrossAPandBC >= Math.max(bY, cY))
            System.out.println("This point is out of triangle");
        else if (yCrossCPandAB <= Math.min(aY, bY) || xCrossAPandBC >= Math.max(aY, bY))
            System.out.println("This point is out of triangle");
        else if (yCrossBPandCA <= Math.min(cY, aY) || xCrossAPandBC >= Math.max(cY, aY))
            System.out.println("This point is out of triangle");
        else
            System.out.println("This point is in of triangle");

    }
}

