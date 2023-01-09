package one;

public class Cat extends Animal {

    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
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
        return "Cat, name = " + name;
    }


    @Override
    public String getVoice() {
        return "Cat " + name + " : meow!!!";
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + name + " is sleeping...");
    }


}