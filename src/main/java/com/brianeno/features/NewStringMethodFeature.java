package com.brianeno.features;

import java.util.stream.Stream;

/*
  Shows new methods in String class
*/
public class NewStringMethodFeature {

    public void runFeature() throws Exception {
        // lines
        String testStr = "This is a test string\nwith multiple lines\nAnd a third line";
        Stream<String> stream = testStr.lines();
        stream.forEach(System.out::println);

        // isBlank
        String str1 = "";
        System.out.println("'" + str1 + "' is blank: " + str1.isBlank());
        str1 = " ";
        System.out.println("'" + str1 + "' is blank: " + str1.isBlank());
        str1 = "a";
        System.out.println("'" + str1 + "' is blank: " + str1.isBlank());

        // strip
        String str = "  Brian Eno  ";
        System.out.println("'" + str.strip() + "'");      //"Hello World !!"
        System.out.println("'" + str.stripLeading() + "'"); //"Hello World !!   "
        System.out.println("'" + str.stripTrailing() + "'");  //"  Hello World !!"

        // repeat
        str = "Brian";
        System.out.println(str.repeat(3));

        // indent
        String text = "Hello Reader!\nThis is a new method called indent";
        text = text.indent(6);
        System.out.println(text);
        text = text.indent(-4);
        System.out.println(text);

        // transform
        text = "BrianEno";
        String transformedText = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println(transformedText);
    }
}
