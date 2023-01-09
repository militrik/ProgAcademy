package homework.animal;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("fish", "black", 5, "Murka");
        Dog dog1 = new Dog("meat", "white", 12, "Bobik");
        Veterinarian vet1 = new Veterinarian("Aibolit");

        vet1.treatment(cat1);
        vet1.treatment(dog1);
        vet1.treatment(new Animal("fruit", null, 100));

        cat1.eat();
        dog1.sleep();

        System.out.println(cat1.getName() + " say " + cat1.getVoice());
        System.out.println(dog1.getName() + " say " + dog1.getVoice());
    }
}
