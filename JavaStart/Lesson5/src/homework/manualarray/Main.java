package homework.manualarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input array size: ");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] myArr = new int[arrSize];
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Input value of " + (i+1) + " element.");
            myArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(myArr));
    }

}
