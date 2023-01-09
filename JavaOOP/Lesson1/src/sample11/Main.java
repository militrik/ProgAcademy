package sample11;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Cat cat1 = new Cat();
        cat1.name = "Barsic";
        cat1.color = "Black";
        cat1.weight = 4;

        System.out.println(cat1.meow());

        System.out.println(cat1.getClass());

        Cat cat2 = new Cat();
        cat2.name = "rasik";

        System.out.println(cat1);
        System.out.println(cat2);

    }

}