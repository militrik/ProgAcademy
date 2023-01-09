package sample71;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        PrinterTask task1 = new PrinterTask(printer, "Push");
        PrinterTask task2 = new PrinterTask(printer, "Pull");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}