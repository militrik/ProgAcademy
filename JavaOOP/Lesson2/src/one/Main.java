package one;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("beer", "black", 100);
        System.out.println(animal1);
        System.out.println(animal1.getVoice());
        animal1.eat();
        animal1.sleep();
        System.out.println();

        Cat cat1 = new Cat("fish", "white", 5, "Tom");
        System.out.println(cat1);
        System.out.println(cat1.getVoice());
        cat1.eat();
        cat1.sleep();
        System.out.println();

        Dog dog1 = new Dog("meat", "brown", 10, "Chuppy");
        System.out.println(dog1);
        System.out.println(dog1.getVoice());
        dog1.eat();
        dog1.sleep();
        System.out.println();

        Veterinarian vet1 = new Veterinarian("Bogdan");
        System.out.println(vet1);
        vet1.treatment(animal1);
        vet1.treatment(cat1);
        vet1.treatment(dog1);

    }

}