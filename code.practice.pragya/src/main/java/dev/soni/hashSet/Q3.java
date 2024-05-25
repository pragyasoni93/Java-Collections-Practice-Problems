package dev.soni.hashSet;

//Create a HashMap to store the mappings of country names to their capitals.

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington D.C.");
        countryMap.put("UK", "London");
//        countryMap.put("UK", "Londonnnnn");


        countryMap.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
