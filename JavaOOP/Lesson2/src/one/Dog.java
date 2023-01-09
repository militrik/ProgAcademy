package one;

public class Dog extends Animal {

    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
        super();

    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog, name = " + name;
    }

    @Override
    public String getVoice() {

        return "Dog " + name + " : Arrrrr!!!";
    }

    @Override
    public void eat() {
        System.out.println("Dog " + name + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + name + " is sleeping...");
    }

}