package sample;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File file = new File("price.txt");
        Integer price = null;
        try {
            Scanner sc = new Scanner(file);
            price = sc.nextInt();
            if (price <= 0) {
                price = null;
                throw new NegativePriceException();
            }
        } catch (NegativePriceException e) {
            System.out.println("Negative Price");
        }
        catch (IOException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("Error file format");
        } finally {
            System.out.println("Thank you for using our service :) ");
        }

        System.out.println("price = " + price);
    }

}