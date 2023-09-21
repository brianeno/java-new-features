package com.brianeno.features;

import java.util.Arrays;
import java.util.List;

/*
  Shows Collection to Arrays new method
*/
public class CollectionToArrayFeature {

    public void runFeature() {
        List<String> sampleList = Arrays.asList("Brian", "Enochson");
        String[] sampleArray = sampleList.toArray(String[]::new);
        System.out.println(Arrays.toString(sampleArray));
    }
}
