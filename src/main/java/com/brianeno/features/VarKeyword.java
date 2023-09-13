package com.brianeno.features;

public class VarKeyword {

    // this is not allowed as class variable
    //var i = 1300;

    // var cannot be a method parameter or return types
    //public void testVar(var i) {

    public void runFeature() {
        // must be initialized
        //var t;

        var x = 250;

        // double
        var y = 3.94;

        // char
        var z = 'y';

        // string
        var p = "brian";

        // boolean
        var q = false;

        // type inference is used in var keyword in which it
        // automatically detects the datatype of a variable
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
    }
}
