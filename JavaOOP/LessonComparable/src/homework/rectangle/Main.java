package homework.rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                new Rectangle(5,6),
                new Rectangle(7,8),
                new Rectangle(1,3),
                new Rectangle(3,1)
        };

        Arrays.sort(rectangles, Rectangle::compareTo);
        System.out.println(Arrays.toString(rectangles));
    }
}