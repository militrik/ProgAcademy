package homework.threadsfactorial;

public class CalculateFactorialTask implements Runnable {
    private int num;

    public CalculateFactorialTask(int i) {
        num = i;
    }

    @Override
    public void run() {
        long id = Thread.currentThread().getId();
        System.out.println("thread " + id + " started with NUM " + num);
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(num + "! = " + factorial + " in thread " + id);
    }
}
