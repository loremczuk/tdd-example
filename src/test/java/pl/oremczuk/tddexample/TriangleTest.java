package pl.oremczuk.tddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    private Figure triangle;

    @BeforeEach
    void setTriangle() {
        int a = 7;
        int b = 24;
        int c = 25;
        int h = 24;

        triangle = new Triangle(a,b,c,h);

    }

    @Test
    void shouldCreateATriangle() {
        Assertions.assertNotNull(triangle);
    }

    @Test
    void shouldCalculateArea() {

        double expectedResult = 84;
        double area = triangle.calculateArea();
        Assertions.assertEquals(expectedResult, area);
    }

    @Test
    void shouldCalculatePerimeter() {

        int expectedResult = 56;
        double perimeter = triangle.calculatePerimeter();
        Assertions.assertEquals(expectedResult, perimeter);

    }
}
