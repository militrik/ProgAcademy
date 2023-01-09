package sample71;

public class Printer {

    private Long thrId = null;

    public synchronized void print(String text) {

        Thread thr = Thread.currentThread();
        Long currentThreadId = thr.getId();
        while (currentThreadId.equals(thrId)) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.print(text + " ");
        thrId = currentThreadId;
        notifyAll();
    }
}