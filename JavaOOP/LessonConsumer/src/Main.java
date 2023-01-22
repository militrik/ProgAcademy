import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 8, 55, 88, 555, 888);

        Consumer<Integer> cons = integer -> System.out.print(integer % 2 != 0 ? integer + System.lineSeparator() : "");
        list.forEach(cons);
    }
}