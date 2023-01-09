package homework.triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;

    private String name;

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean checkTriangle() {
        if (a + b < c
                || a + c < b
                || c + b < a) {
            return false;
        }
        return true;
    }

    public String Area() {
        if (!checkTriangle()) {
            return "n/a";
        } else {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return "" + area;
        }
    }

}