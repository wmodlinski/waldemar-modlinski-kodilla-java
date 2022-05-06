package com.kodilla.testing.shape;

public class Circle implements Shape {
    //posiadające już właściwe implementacje metod interfejsu.

    private String name;
    protected double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getField() {
        double field = Math.PI * radius * radius;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle name is " + name + " and it's radius is " + radius;
    }

}
