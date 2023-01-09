package homework.threadsfactorial;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            CalculateFactorialTask task = new CalculateFactorialTask(i);
            Thread thread = new Thread(task);
            thread.start();
        }

        System.out.println("end");
    }
}
