package sample92;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Pair<Integer, String> pair1 = new Pair<>(5, "five");

//    pair1.setLeft("Hello");

        int s = 5 + pair1.getLeft();

        System.out.println(s);

        Pair<Character, Integer> pair2 = new Pair<>('A', 10);

        System.out.println(pair1);
        System.out.println(pair2);

        Pair<? extends Number, ?> pair3 = pair1;

        Integer[] array = new Integer[] { 5, 3, 9, 1 };
        Integer max1 = getMax(array);
        System.out.println(max1);
    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }

}