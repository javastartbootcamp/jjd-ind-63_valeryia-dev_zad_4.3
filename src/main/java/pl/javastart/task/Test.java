package pl.javastart.task;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        double circleArea = circle.calculateArea(circle);
        System.out.println(circleArea);

        Rectangle rectangle = new Rectangle(11, 20);
        double rectanglePerimeter = rectangle.calculateRectPerimeter(rectangle);

        Triangle triangle = new Triangle(23, 17, 39);
        triangle.calculatePerimeter(triangle);

        Square square = new Square(5);
        double squarePerimeter = square.calculateArea(square);
        System.out.print(squarePerimeter);
    }
}
