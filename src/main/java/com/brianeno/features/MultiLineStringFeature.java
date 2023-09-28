package com.brianeno.features;

/*
  Shows Multiline Strings
*/
public class MultiLineStringFeature {

    public void runFeature() {

        String s = """
                “All modern American literature comes from one book by Mark Twain called Huckleberry Finn. 
                American writing comes from that. 
                There was nothing before. 
                There has been nothing as good since.”
                --Ernest Hemingway""";
        System.out.println(s);
    }
}
