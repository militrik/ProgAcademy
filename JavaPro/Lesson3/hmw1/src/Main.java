import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {

        Class<TestClass> testClassClass = TestClass.class;
        TestClass testClass = testClassClass.newInstance();

        Method[] methods = testClassClass.getDeclaredMethods();
        for (var method : methods
        ) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                method.invoke(testClass, test.a(), test.b());
            }
        }
    }
}
