package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    // addFigure(Shape shape),
    // removeFigure(Shape shape)
    // getFigure(int n) oraz
    // showFigures()
    protected ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape choice = shapes.get(n);
        return choice;
    }

    public void showFigures() {
        int shapesCount = shapes.size();

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }
}
