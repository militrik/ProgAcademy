package homework.doublecola;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("Sheldon");
        queue.add("Leonard");
        queue.add("Volovic");
        queue.add("Kutrapalli");
        queue.add("Penny");

        int cupsAmount = 2;

        while (cupsAmount > 0) {
            String temp;
            temp = queue.poll();
            queue.offer(temp);
            queue.offer(temp);
            cupsAmount--;
        }

        System.out.println(queue);
    }
}
