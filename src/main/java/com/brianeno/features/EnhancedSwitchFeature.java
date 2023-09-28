package com.brianeno.features;

/*
  Shows enhanced switch methods
*/
public class EnhancedSwitchFeature {

    public void runFeature() throws Exception {

        // multiple values in case line
        int errorCode = 404;
        switch (errorCode) {
            case 400, 404, 405:
                System.out.println("Something is wrong with the request code is: " + errorCode);
                break;
            case 500, 501, 505:
                System.out.println("Something is wrong with the server code is: " + errorCode);
                break;
        }

        // switch with arrow
        switch (errorCode) {
            case 404 -> System.out.println("HTTP Not found");
            case 500 -> System.out.println("HTTP Internal server error");
        }

        // return value
        String message = switch (errorCode) {
            case 404:
                yield "HTTP Not found!";
            case 500:
                yield "HTTP Internal server error";
            default:
                throw new IllegalArgumentException("This is an unexpected value: " + errorCode);
        };
        System.out.println(message);


    }
}

