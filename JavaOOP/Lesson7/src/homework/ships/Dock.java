package homework.ships;

public class Dock {
    private boolean isBusy = false;

    private double onePackUnloadTime = 0.0;

    public Dock(double onePackUnloadTime) {
        this.onePackUnloadTime = onePackUnloadTime;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public double getOnePackUnloadTime() {
        return onePackUnloadTime;
    }
}
