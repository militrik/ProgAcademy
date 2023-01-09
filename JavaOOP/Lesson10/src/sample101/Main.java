package sample101;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 100; i++) {
            list1.add(rn.nextInt(100));
        }
        //System.out.println(list1);

        Map<Integer, Integer> stat = new HashMap<>();

        for (Integer element : list1) {

            if (stat.get(element) == null) {
                stat.put(element, 1);
            }else{
                stat.put(element, stat.get(element)+1);
            }
        }
        System.out.println(stat);
    }

}