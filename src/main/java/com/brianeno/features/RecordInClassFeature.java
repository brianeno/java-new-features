package com.brianeno.features;

/*
  Shows example of a Record declared in a class
*/
record SensorValue(int id, String name, String makeAndModel) {
}

public class RecordInClassFeature {

    public void runFeature() {

        // using Sensor record
        SensorValue s1 = new SensorValue(2, "sensor b", "acme corp");
        System.out.println(s1.toString());
        System.out.println(s1.id());
        System.out.println(s1.name());
        System.out.println(s1.makeAndModel());
    }
}
