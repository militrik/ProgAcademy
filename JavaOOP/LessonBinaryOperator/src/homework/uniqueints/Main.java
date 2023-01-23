package homework.uniqueints;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(List.of(54, 87, 6, 43, 54, 2, 10, 6));
        List<Integer> integerList2 = new ArrayList<>(List.of(55, 88, 6, 44, 55, 2, 11, 6, 789));

        BinaryOperator<List<Integer>> listBinaryOperator = (integers1, integers2) -> {
            integers1.retainAll(integers2);
            return integers1;
        };
        System.out.println(listBinaryOperator.apply(integerList1, integerList2));
    }
}