package com.brianeno.features;

import org.junit.jupiter.api.Test;

/*
   Demonstrates virtual threads
 */
public class VirtualThreadFeatureTest {

    @Test
    public void testFeature() {
        VirtualThreadFeature feature = new VirtualThreadFeature();
        feature.runFeature();
    }
}
