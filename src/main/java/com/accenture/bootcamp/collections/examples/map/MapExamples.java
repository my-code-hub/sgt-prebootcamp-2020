package com.accenture.bootcamp.collections.examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    public static void main(String[] args) {
        //productName -> productCount
        Map<String, Integer> products = new LinkedHashMap<>();

        products.put("P1", 10);
        products.put("P2", 5);

        products.put("P3", 3);
        products.put("P3", 5);

        System.out.println("products.size() " + products.size());

        System.out.println(products.get("P3"));

        System.out.println("products.get(\"P5\"): " + products.get("P5"));

        if (products.containsKey("P2")) {
            System.out.println("P2 count is " + products.get("P2"));
        }

        products.put("P6", 100);
        System.out.println("products.size() " + products.size());
        products.remove("P6");
        System.out.println("products.size() " + products.size());

        Set<String> keys = products.keySet();
        System.out.println("keys: " + keys);

        Collection<Integer> values = products.values();
        System.out.println("keys: " + values);

        System.out.println(" **** loop through all entries ****");
        Set<Map.Entry<String, Integer>> entries = products.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key - " + entry.getKey() + " | value - " + entry.getValue());
        }

        System.out.println(" **** loop through all entries 2 ****");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println("key - " + entry.getKey() + " | value - " + entry.getValue());
        }

    }
}
