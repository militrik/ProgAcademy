package homework.animal;

public class Cat extends Animal {
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getVoice() {
        return "meow-meow";
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eating " + getRation() +".");
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
