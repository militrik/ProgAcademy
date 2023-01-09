package one;

public class Veterinarian {

    private String name;

    public Veterinarian(String name) {
        super();
        this.name = name;
    }

    public Veterinarian() {
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
        return "Veterinarian [name=" + name + "]";
    }

    public void treatment(Animal animal) {
        System.out.println("I'm treating your " + animal);
    }
}