package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double wallLength;
    private double height;

    public Triangle(String name, double wallLength, double height) {
        this.name = name;
        this.wallLength = wallLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public double getWallLength() {
        return wallLength;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getField() {
        double field = (wallLength * height) / 2;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.wallLength, wallLength) != 0) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(wallLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle name is " + name + " and it's wall length is  " + wallLength + ", also, it height is " + height;
    }

}
