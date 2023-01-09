package sample61;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int size = 100_000_000;
        int[] array = new int[size];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = -500_000 + rn.nextInt(1_000_000);
        }

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getPriority());
        System.out.println("Start");

        long start;
        long end;

        start = System.nanoTime();
        System.out.println("static method = " + findMin(array));
        end = System.nanoTime();
        System.out.println((end - start) / 1000000 + " ns");

        FindMinTask task1 = new FindMinTask(array, 0, size * 1 / 5);
        FindMinTask task2 = new FindMinTask(array, size * 1 / 5, size * 2 / 5);
        FindMinTask task3 = new FindMinTask(array, size * 2 / 5, size * 3 / 5);
        FindMinTask task4 = new FindMinTask(array, size * 3 / 5, size * 4 / 5);
        FindMinTask task5 = new FindMinTask(array, size * 4 / 5, size * 5 / 5);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        Thread thread5 = new Thread(task5);

        start = System.nanoTime();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//    try {
//      Thread.sleep(3000);
//    } catch (InterruptedException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

        int min1 = task1.getMinElement();
        int min2 = task2.getMinElement();
        int min3 = task3.getMinElement();
        int min4 = task4.getMinElement();
        int min5 = task5.getMinElement();

        if (min2 < min1) {
            min1 = min2;
        }
        if (min3 < min1) {
            min1 = min3;
        }
        if (min4 < min1) {
            min1 = min4;
        }

        System.out.println("Multy thread min = " + min1);
        end = System.nanoTime();
        System.out.println((end - start) / 1000000 + " ns");

        System.out.println("End");
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

}