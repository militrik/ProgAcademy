package sample73;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PlaySong ps = new PlaySong();

        PlayerTask task1 = new PlayerTask(ps, "Hop");
        PlayerTask task2 = new PlayerTask(ps, "Hey");
        PlayerTask task3 = new PlayerTask(ps, "Lalaley");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        ps.addThreads(new Thread[] { thread1, thread2, thread3 });

        thread1.start();
        thread2.start();
        thread3.start();
    }

}