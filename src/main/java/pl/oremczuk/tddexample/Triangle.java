package pl.oremczuk.tddexample;

public class Triangle implements Figure {

    private int a;
    private int b;
    private int c;
    private int h;


    public Triangle(int a, int b, int c, int h) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public double calculateArea() {
        return 0.5 * a * h;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
