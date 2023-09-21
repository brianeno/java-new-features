package com.brianeno.features;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewStringMethodFeatureTest {

    @Test
    void runFeature() throws Exception {
        NewStringMethodFeature feature = new NewStringMethodFeature();
        feature.runFeature();
    }
}