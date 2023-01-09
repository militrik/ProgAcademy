package homework.arrow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h;
        System.out.println("Input h");
        h = sc.nextInt();

        int i = 0;
        int j = 0;
        int steps = 0;

        while (steps < h * 2 - 1) {
            System.out.print("*");


            if (steps < h) {
                if (i >= j) {
                    System.out.println("");
                    j++;
                    i = 0;
                    steps++;
                    continue;
                }
                i++;
            } else {
                if (i > j - 3) {
                    System.out.println("");
                    j--;
                    i = 0;
                    steps++;
                    continue;
                }
                i++;
            }
        }
    }
}


