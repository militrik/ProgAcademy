package one;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal(String ration, String color, int weight) {
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
        super();
    }

    String getRation() {
        return ration;
    }

    void setRation(String ration) {
        this.ration = ration;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
    }

    public String getVoice() {
        return "Animal is saying something...";
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleaping...");
    }
}