package sample92;

public class Pair<L, R> {
    private Object left;
    private Object rigth;

    public Pair(L left, R rigth) {
        super();
        this.left = left;
        this.rigth = rigth;
    }

    public L getLeft() {
        return (L) left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public R getRigth() {
        return (R) rigth;
    }

    public void setRigth(R rigth) {
        this.rigth = rigth;
    }

    @Override
    public String toString() {
        return "Pair [left=" + left + ", rigth=" + rigth + "]";
    }

}