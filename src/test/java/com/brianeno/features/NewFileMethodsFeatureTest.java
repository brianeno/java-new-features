package com.brianeno.features;

import com.brianeno.features.NewFileMethodsFeature;
import org.junit.jupiter.api.Test;

class NewFileMethodsFeatureTest {

    @Test
    void runFeature() throws Exception {
        NewFileMethodsFeature feature = new NewFileMethodsFeature();
        feature.runFeature();
    }
}