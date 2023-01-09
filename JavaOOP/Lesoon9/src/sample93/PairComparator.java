package sample93;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair<Integer, String>> {

    @Override
    public int compare(Pair<Integer, String> o1, Pair<Integer, String> o2) {
        // TODO Auto-generated method stub

        if (o1.getLeft() > o2.getLeft()) {
            return 1;
        }
        if (o1.getLeft() < o2.getLeft()) {
            return -1;
        }

        return 0;
    }

}