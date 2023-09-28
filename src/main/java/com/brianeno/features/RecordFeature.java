package com.brianeno.features;

import com.brianeno.features.model.Sensor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  Shows example of Streams.toList
*/
public class RecordFeature {

    public void runFeature() {

        // using Sensor record
        Sensor s1 = new Sensor(1, "sensor a", "acme x");
        System.out.println(s1.toString());
    }
}
