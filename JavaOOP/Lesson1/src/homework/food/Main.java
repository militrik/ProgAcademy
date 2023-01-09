package homework.food;

public class Main {
    public static void main(String[] args) {

        Food meat = new Food();
        meat.setName("Meat");
        meat.setPrice(200);
        meat.setUnit("kg");
        Food macaroni = new Food("Macaroni", 25, "pack", "19.12.2022");
        Food bread = new Food("Bread", 12, "piece", "07.12.2022");

        System.out.println(meat);
        System.out.println("The price of "
                + macaroni.getName()
                + " is " + macaroni.getPrice()
                + " per " + macaroni.getUnit() + ".");
        System.out.println("The " + bread.getName() + " expiried date is " + bread.getExpiry() + ".");
    }
}
