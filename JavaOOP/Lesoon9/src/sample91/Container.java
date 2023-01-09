package sample91;

public class Container <E> {
    private Object element;

    public Container(E element) {
        this.element = element;
    }

    public Object getElement() {
        return (E)element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Container{" +
                "element=" + element +
                '}';
    }
}
