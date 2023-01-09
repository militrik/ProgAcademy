package sample73;

public class PlaySong {

    private long[] threadsId;
    private int threadIndex = 0;

    public void addThreads(Thread[] threads) {
        threadsId = new long[threads.length];
        for (int i = 0; i < threads.length; i++) {
            threadsId[i] = threads[i].getId();
        }
    }

    public synchronized void playSong(String textSong) {
        Thread thr = Thread.currentThread();
        long thrId = thr.getId();
        for (; thrId != threadsId[threadIndex];) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.print(textSong + " ");
        threadIndex = (threadIndex + 1) % threadsId.length;
        notifyAll();
    }

}