package homework.sumarray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        int[] numsArray = new int[240_985_921];
        Random randomNum = new Random();
        for (int i = 0; i < numsArray.length; i++) {
            //numsArray[i] = randomNum.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            numsArray[i] = randomNum.nextInt(0, 9);
        }

        start = System.nanoTime();
        CalculateSumTask oneThread = new CalculateSumTask(numsArray, 0, numsArray.length);
        int totalSumOneThread = oneThread.calculateSum();
        end = System.nanoTime();
        System.out.println("total sum " + totalSumOneThread + " in "+ ((end - start) / 1000000 + " mS by 1 thread"));

        start = System.nanoTime();
        int threadsAmount = 8;
        int remainderArray = numsArray.length % threadsAmount;
        int arrayPartSize = numsArray.length / threadsAmount;

        Thread[] threads = new Thread[threadsAmount];
        CalculateSumTask[] calculateSumTasks = new CalculateSumTask[threadsAmount];

        for (int i = 0; i < threadsAmount; i++) {
            calculateSumTasks[i] = new CalculateSumTask(numsArray, i * arrayPartSize, (i + 1) * arrayPartSize);
            threads[i] = new Thread(calculateSumTasks[i]);
            threads[i].start();
        }

        for (Thread thread : threads
        ) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        CalculateSumTask remainderTask = new CalculateSumTask(numsArray, numsArray.length - remainderArray, numsArray.length);
        int totalSum = remainderTask.calculateSum();

        for (CalculateSumTask element : calculateSumTasks
        ) {
            totalSum += element.getSum();
        }
        end = System.nanoTime();
        System.out.println("total sum " + totalSum + " in "+ ((end - start) / 1000000 + " mS by " + threadsAmount + " threads"));


    }
}
