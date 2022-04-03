package pl.oremczuk.tddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {


    private Figure rectangle;

    @BeforeEach
    void setRectangle() {
        int a = 5;
        int b = 7;

        rectangle = new Rectangle(a,b);
    }

    @Test
    void shouldCreateARectangle() {

        Assertions.assertNotNull(rectangle);
    }

    @Test
    void shouldCalculateArea() {

        int expectedResult = 35;

        double area = rectangle.calculateArea();

        Assertions.assertEquals(expectedResult, area);

    }

    @Test
    void shouldCalculatePerimeter() {

        int expectedResult = 24;

        double perimeter = rectangle.calculatePerimeter();

        Assertions.assertEquals(expectedResult, perimeter);

    }

}
