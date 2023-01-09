package sample;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rn = new Random();

        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                array[i] = -array[i];
        }
        System.out.println(Arrays.toString(array));
    }

}
