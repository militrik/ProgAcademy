package extrahomework.numsequence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input integer numbs sequence separated by commas: ");
        Scanner sc = new Scanner(System.in);
        String[] numsS = sc.nextLine().split(",");
        int[] numsI = new int[numsS.length];
        for (int i = 0; i < numsS.length; i++) {
            numsI[i] = Integer.valueOf(numsS[i]);
        }

        if (isArithmetic(numsI))
            nextArithmetic(numsI);
        else if (isGeometric(numsI))
            nextGeometric(numsI);
        else if (isSquareArithmetic(numsI))
            nextSquareArithmetic(numsI);
        else if (isCubeArithmetic(numsI))
            nextCubeArithmetic(numsI);
        else
            System.out.println("Wrong sequence");
    }

    public static boolean isArithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (diff != arr[i + 1] - arr[i])
                return false;
        }
        return true;
    }

    public static boolean isGeometric(int[] arr) {
        int diff = 0;
        if (arr[1] % arr[0] != 0)
            return false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (diff != arr[i + 1] / arr[i])
                return false;
        }
        return true;
    }

    public static boolean isSquareArithmetic(int[] arr) {
        int[] roots = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            roots[i] = (int) Math.sqrt(arr[i]);
        }
        return isArithmetic(roots);
    }

    public static boolean isCubeArithmetic(int[] arr) {
        int[] roots = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            roots[i] = (int) Math.cbrt(arr[i]);
        }
        return isArithmetic(roots);
    }

    public static void nextArithmetic(int[] arr) {
        int calc = arr[arr.length - 1] - arr[arr.length - 2] + arr[arr.length - 1];
        System.out.println("This sequence is Arithmetic and its next member is " + calc);
    }

    public static void nextGeometric(int[] arr) {
        int calc = arr[arr.length - 1] / arr[arr.length - 2] * arr[arr.length - 1];
        System.out.println("This sequence is Geometric and its next member is " + calc);
    }

    public static void nextSquareArithmetic(int[] arr) {
        int calc = (int) (Math.sqrt(arr[arr.length - 1]) - Math.sqrt(arr[arr.length - 2]) + Math.sqrt(arr[arr.length - 1]));
        System.out.println("This sequence is Square Arithmetic and its next member is " + (int)Math.pow(calc, 2));
    }

    public static void nextCubeArithmetic(int[] arr) {
        int calc = (int) (Math.cbrt(arr[arr.length - 1]) - Math.cbrt(arr[arr.length - 2]) + Math.cbrt(arr[arr.length - 1]));
        System.out.println("This sequence is Cube Arithmetic and its next member is " + (int)Math.pow(calc, 3));
    }
}

