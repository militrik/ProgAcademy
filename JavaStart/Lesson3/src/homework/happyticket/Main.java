package homework.happyticket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input num in interval 1000..9999");
        int num = sc.nextInt();
        if (num < 0 || num > 9999) {
            System.out.println("Wrong num \uD83D\uDE11");
        } else {
            int thouthands = num / 1000;
            num = num % 1000;
            int hundreds = num / 100;
            num = num % 100;
            int tens = num / 10;
            num = num % 10;
            int ones = num;

            if (thouthands + hundreds == tens + ones)
                System.out.println("Luckyman \uD83D\uDE00");
            else
                System.out.println("Looser \uD83D\uDE15");
        }
    }
}
