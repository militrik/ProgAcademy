package homework.one.fuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("H120ow long is your trip?");
        Scanner sc = new Scanner(System.in);

        double fuelCost = 1.2;
        double fuelConsumption = 8.0;
        double distance = sc.nextDouble();

        double tripCost = distance / 100 * fuelConsumption * fuelCost;

        System.out.println("The tripCost cost is " + tripCost + "$.");
    }
}