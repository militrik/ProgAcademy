package sample61;

public class FindMinTask implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int minElement;

    public FindMinTask(int[] array, int start, int end) {
        super();
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getMinElement() {
        return minElement;
    }

    public int findMin(int[] array, int start, int end) {
        int min = array[start];
        for (int i = start; i < end; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        System.out.println(thr.getName() + " start");
        minElement = findMin(array, start, end);
        System.out.println("min = " + minElement + " " + thr.getName());

    }

}