package pl.javastart.task;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return Math.sqrt(square.getA());
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.sqrt(circle.getR());
    }

    public void calculateTrianglePerimeter(Triangle triangle) { // jak zrobic z typem double
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

    public double calculateRectPerimeter(Rectangle rectangle) {
        return ((rectangle.getA() + rectangle.getB()) / 2);
    }

}


