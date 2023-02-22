public class TestClass {
    public TestClass() {
    }

    @Override
    public String toString() {
        return "TestClass{}";
    }

    @Test(a = 3, b = 4)
    public void test1(int a, int b) {
        System.out.println("Annotated with parameters: A is " + a + ", B is " + b);
    }

    @Test()
    public void test2(int a, int b) {
        System.out.println("Annotated with default parameters: A is " + a + ", B is " + b);
    }

    public void test3(int a, int b) {
        System.out.println("Not annotated");
    }
}
