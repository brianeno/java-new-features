package com.brianeno.features;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListOfFeatureTest {

    @Test
    void runFeature() {
        ListOfFeature feature = new ListOfFeature();
        feature.runFeature();
    }
}