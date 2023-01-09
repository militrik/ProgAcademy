package homework.ships;

public class Ship implements Runnable {
    private Dock[] docks;

    private int myDock;
    private int cargoAmount;

    public Ship(int cargoAmount, Dock[] docks) {
        this.cargoAmount = cargoAmount;
        this.docks = docks;
    }

    private boolean isAllDocksBusy() {
        for (int i = 0; i < docks.length; i++) {
            if (!this.docks[i].isBusy()) {
                this.myDock = i;
                this.docks[i].setBusy(true);
                return false;
            }
        }
        return true;
    }

    @Override
    synchronized public void run() {

        while (isAllDocksBusy()) {
            try {
                wait(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Unloading ship " + Thread.currentThread().getId() + " in dock " + myDock);
        while (cargoAmount > 0) {
            cargoAmount--;
            try {
                Thread.sleep((int) docks[myDock].getOnePackUnloadTime());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Unloaded ship " + Thread.currentThread().getId() + " from dock " + myDock);
        docks[myDock].setBusy(false);
        //notifyAll();
    }
}
