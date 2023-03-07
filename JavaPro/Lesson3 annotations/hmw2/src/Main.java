import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Object container = Container.class.getConstructor(String.class).newInstance("myText");
        Arrays.stream(container.getClass().getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(Saver.class))
                .forEach(method -> {
                    try {
                        method.invoke(container);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
