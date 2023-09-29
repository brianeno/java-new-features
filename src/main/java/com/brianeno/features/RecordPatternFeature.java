package com.brianeno.features;

/*
  Shows Collection to Arrays new method
*/

record SampleRecord(int id, String name) {
}

public class RecordPatternFeature {


    public void runFeature() {
        SampleRecord record = new SampleRecord(1, "Brian Eno");
        if (record instanceof SampleRecord(int i, String name)) {
            System.out.println("Sample record " + record.toString());
        }

        SampleRecord record2 = new SampleRecord(2, "Tom Smith");
        SampleRecord [] recs = {record, record2};
        // PREVIEW FEATURE record patterns will be used in for looks
        //for(SampleRecord(int i, String name) : recs) {}

        // but can do this of course
        for(SampleRecord s : recs) {
            System.out.println("Sample record " + s.toString());
        }
    }
}
