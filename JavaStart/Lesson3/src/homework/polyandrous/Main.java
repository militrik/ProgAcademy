package homework.polyandrous;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input num with six signs");
        int num = sc.nextInt();
        if (num < 0 || num > 999999) {
            System.out.println("Wrong num");
        } else {
            int p6 = num / 100000;
            num = num % 100000;
            int p5 = num / 10000;
            num = num % 10000;
            int p4 = num / 1000;
            num = num % 1000;
            int p3 = num / 100;
            num = num % 100;
            int p2 = num / 10;
            int p1 = num % 10;

            if (p6==p1 && p5==p2 && p4==p3)
                System.out.println("This num is polyandrous");
            else
                System.out.println("This num isn't polyandrous");
        }
    }
}
