package homework.transpondarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Input rotation degrees: ");
        int rotation = 360 - sc.nextInt() / 90;
        int[][] array = new int[size][size];

        System.out.println("Normal array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * array.length + j;
            }
            System.out.println(Arrays.toString(array[i]));
        }



        while (rotation>0) {
            for (int i = 0; i < array.length / 2; i++) { // switch perimeters
                for (int j = 0 + i; j < array.length - 1 - i; j++) { // rearrange each element in perimeters
                    int x = i;
                    int y = j;
                    for (int k = 0; k < 3; k++) { // separately rearrange each perimeter's side
                        int a = x;
                        int b = y;
                        switch (k) { // calculate next coordinates
                            case 0 -> {
                                x = y;
                                y = array.length - 1 - i;
                            }
                            case 1 -> {
                                y = array.length - 1  - x;
                                x = array.length - 1 - i;
                            }
                            case 2 -> {
                                x = y;
                                y = 0 + i;
                            }
                            /*case 3 -> {
                                y = y;
                                x = 0 + i;
                            }*/
                            default -> {
                            }
                        }
                        int temp = array[a][b];
                        array[a][b] = array[x][y];
                        array[x][y] = temp;
                    }
                }
            }
            rotation--;
        }

        System.out.println("\nRotated array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}


