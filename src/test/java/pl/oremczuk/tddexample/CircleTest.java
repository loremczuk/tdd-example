package pl.oremczuk.tddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    private Figure circle;

    @BeforeEach
    void setCircle() {

        int r = 5;
        circle = new Circle(r);

    }

    @Test
    void shouldCreateACircle() {

        Assertions.assertNotNull(circle);

    }

    @Test
    void shouldCalculateArea() {

        double expectedResult = 78.53981633974483;
        double area = circle.calculateArea();

        Assertions.assertEquals(expectedResult, area);
    }

    @Test
    void shouldCalculatePerimeter() {

        double expectedResult = 31.41592653589793;
        double perimeter = circle.calculatePerimeter();
        Assertions.assertEquals(expectedResult,perimeter);
    }
}
