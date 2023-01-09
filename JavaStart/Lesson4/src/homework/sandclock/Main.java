package homework.sandclock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        short s = (short) 1_000_000_000;


        byte имя = 10;


        int x2 = (int) 10_000_000_000_00.12345;


        long l = 10_000_000_000L;


        float f1 = (float) 0.12345;


        double d = 10_000_000_000_00.12345;


        float f2 = 10;


        System.out.println(x2);
        Scanner sc = new Scanner(System.in);
        int w;
        System.out.println("Input h");
        w = sc.nextInt();

        double kkk = 1.0 / 0.0;

        if (w % 2 == 0) {
            System.out.println("Input isn't odd");
        } else {
            int step;
            step = 0;
            while (step <= w / 2) {
                for (int i = 0; i < step; i++)
                    System.out.print(" ");
                for (int i = 0; i < w - step * 2; i++)
                    System.out.print("*");
                for (int i = 0; i < step; i++)
                    System.out.print(" ");
                System.out.println("");
                step++;
            }
            step -= 2;
            while (step + 1 > 0) {
                for (int i = 0; i < step; i++)
                    System.out.print(" ");
                for (int i = 0; i < w - step * 2; i++)
                    System.out.print("*");
                for (int i = 0; i < step; i++)
                    System.out.print(" ");
                System.out.println("");
                step--;
            }
        }
    }
}


