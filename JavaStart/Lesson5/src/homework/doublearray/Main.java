package homework.doublearray;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[15];
        Random rn = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rn.nextInt(64);
        }

        int[] array2 = Arrays.copyOfRange(array1, 0, array1.length * 2 );
        for (int i = array1.length; i < array2.length; i++) {
            array2[i] = array1[i-array1.length]*2;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}
