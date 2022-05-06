package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beggining of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test number " + testCounter);
    }

    @Nested
    @DisplayName("Test of performed operations on the figures ")
    class OperationsFigures {

        @Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();

            //when
            Circle circle1 = new Circle("circle1", 12);
            Triangle triangle1 = new Triangle("triangle1", 12, 15);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(triangle1);

            //then
            Assert.assertEquals(2, shapeCollector.shapes.size());
        }

        @Test
        public void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle("circle1", 12);
            Triangle triangle1 = new Triangle("triangle1", 12, 15);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(triangle1);

            //when
            Shape retrievedCircle = shapeCollector.getFigure(0);

            //then
            Assert.assertEquals(circle1, retrievedCircle);
        }

        @Test
        public void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle("circle1", 12);
            Triangle triangle1 = new Triangle("triangle1", 12, 15);
            Square square1 = new Square("square1", 12);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(square1);

            //when
            boolean result = shapeCollector.removeFigure(circle1);

            //then
            Assert.assertTrue(result);
            Assert.assertEquals(2, shapeCollector.shapes.size());
        }
    }

    @Nested
    @DisplayName("Geometric figures set test ")
    class ShowsFigures {

        @Test
        public void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle("circle1", 12);
            Triangle triangle1 = new Triangle("triagle1", 12, 15);
            Square square1 = new Square("square1", 12);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(square1);

            //when
            int shapesCount = shapeCollector.shapes.size();

            //then
            Assert.assertEquals(3, shapesCount);
        }
    }
}
