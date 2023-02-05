package pl.javastart.task;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double calculateArea(Square square) {
        return Math.sqrt(square.getA());
    }
}
