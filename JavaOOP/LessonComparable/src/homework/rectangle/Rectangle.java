package homework.rectangle;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {
    private int weight;
    private int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return weight == rectangle.weight && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public int compareTo(Rectangle o) {

        if (o == null) {
            throw new NullPointerException();
        }

        if (this.weight * this.height > o.weight * o.height) {
            return 1;
        }

        if (this.weight * this.height < o.weight * o.height) {
            return -1;
        }
        return 0;
    }
}