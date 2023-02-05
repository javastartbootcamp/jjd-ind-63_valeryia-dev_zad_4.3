package pl.javastart.task;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
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

    public void calculatePerimeter(Triangle triangle) { // jak zrobic z typem double
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("trójkąt istnieje");
            System.out.println(a + b + c);
        } else {
            System.out.println("trójkąt nie istnieje");
        }
    }
}
