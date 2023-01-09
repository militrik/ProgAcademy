package homework.ships;

public class Main {
    public static void main(String[] args) {

        Dock[] docks = new Dock[]{new Dock(500), new Dock(700)};


        Ship ship1 = new Ship(5, docks);
        Ship ship2 = new Ship(10, docks);
        Ship ship3 = new Ship(3, docks);


        Thread unload1 = new Thread(ship1);
        Thread unload2 = new Thread(ship2);
        Thread unload3 = new Thread(ship3);

        unload1.start();
        unload2.start();
        unload3.start();

        try {
            unload1.join();
            unload2.join();
            unload3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }
}
