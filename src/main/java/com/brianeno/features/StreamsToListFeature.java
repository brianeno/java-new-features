package com.brianeno.features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
  Shows example of Streams.toList
*/
public class StreamsToListFeature {

    public void runFeature() {

        List<String> integersAsString = Arrays.asList("21", "22", "23", "24");

        // the previous way, using Collectors.toList()
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        ints.forEach(System.out::println);

        // the new Streams.toList, a little less boilerplate code
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
        intsEquivalent.forEach(System.out::println);
    }
}
