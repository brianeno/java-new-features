package com.brianeno.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Shows List.of, Set.of an Map.of
 */
public class ListOfFeature {

    public void runFeature() {
        List<String> cars = List.of("Ford", "GM", "Toyota", "Volvo");
        System.out.println(cars);

        // Throws runtime UnsupportedOperationException
        //cars.add("BMW");
        Set<String> carsSet = Set.of("Ford", "GM", "Toyota", "Volvo");
        System.out.println(carsSet);

        //Map.of
        Map<Integer, String> carMap = Map.of(1, "Ford", 2, "GM", 3, "Toyota");
        System.out.println(carMap);

        //Map.ofEntries
        Map<Integer, String> intCarMap = Map.ofEntries(Map.entry(1, "Ford"), Map.entry(2, "GM"));
        System.out.println(intCarMap);
    }
}
