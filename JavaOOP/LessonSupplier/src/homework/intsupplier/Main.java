package homework.intsupplier;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        final int[] ptr = {0};
        int[] intArr = new int[]{11, 22, 33, 44, 55};
        IntSupplier intsup = () -> intArr[ptr[0]++];

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intsup.getAsInt());
        }
    }
}
