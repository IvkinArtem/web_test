package org.example.Lesson4;

import Lesson4.Triangle;
import Lesson4.TriangleException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyTest {
    Triangle triangle = new Triangle();


    @ParameterizedTest
    @Order(1)
    @CsvSource({"10, 10, 19", "10, 19, 10", "19, 10, 10"})
    void triangleCalculationSquareTest1(int a, int b, int c) throws TriangleException {
        Assertions.assertEquals(29.663740492392392, triangle.calculateSquare(a, b, c));
    }
    @Test
    @Order(2)
    void triangleCalculationSquareTest2() throws TriangleException {
        Assertions.assertEquals(43.30127018922193, triangle.calculateSquare(10, 10, 10));
    }
    @Test
    void triangleCalculationSquareTest3() {
        Assertions.assertThrows(TriangleException.class, () -> {
            triangle.calculateSquare(0,0,0);
        });
    }
    @Test
    void triangleCalculationSquareTest4() {
        Assertions.assertThrows(TriangleException.class, () -> {
            triangle.calculateSquare(1,1,2);
        });
    }
    @Test
    void triangleCalculationSquareTest5() {
        Assertions.assertThrows(TriangleException.class, () -> {
            triangle.calculateSquare(-1,-1,-1);
        });
    }
}
