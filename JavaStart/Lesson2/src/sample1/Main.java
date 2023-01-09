package sample1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input cups count: ");
        int coffeePrice = sc.nextInt();
        System.out.println("Input cups count: ");
        int cups = sc.nextInt();
        int totalSum;


        totalSum = coffeePrice * cups;

        System.out.println(totalSum + " UAH");
    }
}