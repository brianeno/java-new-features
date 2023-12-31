package com.brianeno.features;

import com.brianeno.features.model.Sensor;

/*
  Shows example of Records, see class Sensor
*/
public class RecordFeature {

    public void runFeature() {

        // using Sensor record
        Sensor s1 = new Sensor(1, "sensor a", "acme x");
        System.out.println(s1.toString());
        System.out.println(s1.id());
        System.out.println(s1.name());
        System.out.println(s1.makeAndModel());
    }
}
