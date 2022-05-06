package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getField() {
        double field = side * side;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Square name is " + name + " and it's side length is " + side;
    }
}
