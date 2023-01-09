package sample91;

public class Main {
    public static void main(String[] args) {

        Container <Integer> con1 = new Container<>(100);
        Container <String> con2 = new Container<>("Hello word");

        //con1.setElement("Java");

        int sum = 50 + (Integer) con1.getElement();
        System.out.println("sum=" + sum);

        System.out.println(con1);
        System.out.println(con2);
    }
}