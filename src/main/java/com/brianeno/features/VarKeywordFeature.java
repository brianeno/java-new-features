package com.brianeno.features;

import com.brianeno.features.model.DirectoryProcessor;
import com.brianeno.features.model.FileProcessor;
import com.brianeno.features.model.Processor;

public class VarKeywordFeature {

    // this is not allowed as class variable
    //var i = 1300;

    // var cannot be a method parameter or return types
    //public void runFeature(var i) {

    public void runFeature() {
        // must be initialized, so this won't work
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

        var aFileProc = new FileProcessor();
        var aDirProc = new DirectoryProcessor();
        Processor aProc = aFileProc;
        System.out.println("Is a File Processor: " + (aProc instanceof FileProcessor));
        aProc = aDirProc;
        System.out.println("Is a Dir Processor: " + (aProc instanceof DirectoryProcessor));
    }
}
