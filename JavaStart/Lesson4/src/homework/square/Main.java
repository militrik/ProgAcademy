package homework.square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w;
        int h;
        System.out.println("Input w");
        w = sc.nextInt();
        System.out.println("Input h");
        h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1)
                    System.out.print("*");
                else {
                    if (j == 0 || j == w - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

