package extrahomework.combination;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input array length: ");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println("All " + factorial(array.length) + " combinations of array are: ");
        allCombination(array);
    }

    public static int factorial(int numb) {
        int a = 1;
        for (int i = 1; i <= numb; i++) {
            a = a * i;
        }
        return a;
    }

    public static void allCombination(int[] array) {
        int i;
        System.out.println(Arrays.toString(array));
        do {
            i = array.length - 1 - 1;
            for (; i >= 0; i--) {
                if (array[i] < array[i + 1]) {
                    break;
                }
            }
            if (i < 0)
                break;

            int j = array.length - 1;
            for (; j >= 0; j--) {
                if (array[i] < array[j]) {
                    break;
                }
            }
            swap(i, j, array);
            reverse(i + 1, array.length - 1, array);
            System.out.println(Arrays.toString(array));

        } while (true);
    }

    public static int[] swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static int[] reverse(int begin, int end, int[] arr) {
        for (int m = begin; m < (end - begin) / 2 + begin + 1; m++) {
            int temp = arr[m];
            arr[m] = arr[end - m + begin];
            arr[end - m + begin] = temp;
        }
        return arr;
    }

}
