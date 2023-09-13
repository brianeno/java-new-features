package com.brianeno.features;

import org.junit.jupiter.api.Test;

/*
    + In JDK 10 and later, you can declare local variables with non-null initializers with the var identifier
        - can be assigned any type
        - will use type inference to determine type
        - cannot be a class or global variable.
        - cannot be a generic type or used with one
        - must have explicit initializer
        - cannot be a method parameter or return types

 */
public class VarKeywordTest {

    @Test
    public void testFeature() {
        VarKeyword vk = new VarKeyword();
        vk.runFeature();
    }
}
