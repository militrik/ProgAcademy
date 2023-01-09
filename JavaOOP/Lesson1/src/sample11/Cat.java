package sample11;

public class Cat {
    public static String name;
    int weight;
    String color;

    public String meow() {
        return "meow meow";
    }

    public void jump() {
        System.out.println("hop");
    }

    public String toString() {
        return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
    }
}