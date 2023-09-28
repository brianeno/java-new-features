package com.brianeno.features;

import com.brianeno.features.model.Circle;
import com.brianeno.features.model.Shape;
import com.brianeno.features.model.Square;
import com.brianeno.features.model.Triangle;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    Demonstrates sealed classes/interface
 */
public class SealedClassFeature {

    public void runFeature() {
        Shape c = new Circle();
        Shape s = new Square();
        Shape t = new Triangle();
        System.out.println(c.draw());
        System.out.println(s.draw());
        System.out.println(t.draw());
    }
}
