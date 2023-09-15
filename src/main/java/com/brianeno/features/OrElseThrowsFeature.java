package com.brianeno.features;

import java.util.Optional;

public class OrElseThrowsFeature {

    public void runFeature() {
        Optional<Integer> op
                = Optional.of(6379);

        try {
            // orElseThrow supplier
            System.out.println(
                    "Value by orElseThrow("
                            + "ArithmeticException::new) method: "
                            + op.orElseThrow(
                            ArithmeticException::new));

        } catch (Exception e) {
            System.out.println("Should not go here: " + e);
            throw e;
        }

        // now create an empty one
        op = Optional.empty();

        try {

            // orElseThrow supplier
            System.out.println(
                    "Value by orElseThrow("
                            + "ArithmeticException::new) method: "
                            + op.orElseThrow(
                            ArithmeticException::new));

            throw new RuntimeException("Should not go here");
        } catch (ArithmeticException e) {
            // empty, should throw this
        }
    }
}
