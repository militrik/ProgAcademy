package homework.bamount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String text = sc.nextLine();

        int n = 0;
        for (int element : text.toCharArray()){
            if (element=='b')
                n++;
        }
    System.out.println("Amount of letter \"b\" is " + n);
    }
}