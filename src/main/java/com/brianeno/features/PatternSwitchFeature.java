package com.brianeno.features;

/*
  Shows Collection to Arrays new method
*/

interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }


public class PatternSwitchFeature {


    public void runFeature() {
        Shape shape = new Circle(3.14);
        double d = getPerimeter(shape);
        System.out.println("Permeter " + shape + " is " + d);

        shape = new Rectangle(3, 5);
        d = getPerimeter(shape);
        System.out.println("Permeter " + shape + " is " + d);
    }

    public double getPerimeter(Shape shape) throws IllegalArgumentException {
        return switch (shape) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c    -> 2 * c.radius() * Math.PI;
            default          -> throw new IllegalArgumentException("Unrecognized shape");
        };
    }
}
