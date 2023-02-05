package pl.javastart.task;

public class Test {
    public static void main(String[] args) {
        ShapeCalculator calculate = new ShapeCalculator();
        Circle circle = new Circle(10);
        System.out.println(calculate.calculateCircleArea(circle));
        Rectangle rectangle = new Rectangle(11, 20);
        System.out.println(calculate.calculateRectPerimeter(rectangle));
        Triangle triangle = new Triangle(23, 17, 39);
        calculate.calculateTrianglePerimeter(triangle);
        Square square = new Square(5);
        System.out.println(calculate.calculateSquareArea(square));
    }
}
