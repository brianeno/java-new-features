package com.brianeno.features;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientFeatureTest {

    @Test
    void runFeature() throws Exception {
        HttpClientFeature feature = new HttpClientFeature();
        feature.runFeature();
    }
}