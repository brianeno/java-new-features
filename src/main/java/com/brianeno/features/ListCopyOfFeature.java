package com.brianeno.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Shows List.copyOf, Set.copyOf an Map.copyOf
 */
public class ListCopyOfFeature {

    public void runFeature() {

        // List.copyOf
        List<String> carList = new ArrayList<>();
        carList.add("Ford");
        carList.add("GM");
        carList.add("Toyota");

        List<String> immutableCarList = List.copyOf(carList);
        System.out.println(immutableCarList);

        // if uncommented Runtime UnsupportedOperationException
        // immutableCarList.add("BMW");

        //  Map.copyOf
        Map<Integer, String> carMap = new HashMap<>();

        carMap.put(1, "Ford");
        carMap.put(2, "GM");
        carMap.put(3, "Toyota");

        Map<Integer, String> immutableCarMap = Map.copyOf(carMap);
        System.out.println(immutableCarMap);

        // if uncommented Runtime UnsupportedOperationException
        // immutableCarMap.put(4, "BMW");
    }
}
