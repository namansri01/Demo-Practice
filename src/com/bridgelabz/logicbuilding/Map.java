package com.bridgelabz.logicbuilding;

import java.util.HashMap;

public class Map {
    public static void main (String args[]) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Naman", 12345);
        empIds.put("Ayush", 45678);
        empIds.put("John", 14569);

        System.out.println(empIds);

        System.out.println(empIds.get("Naman"));

        System.out.println(empIds.containsKey("Ayush"));
        System.out.println(empIds.containsValue(6));

        empIds.put("Ayush" , 54321);
        System.out.println(empIds);

        empIds.replace("Ayush", 444);
        System.out.println(empIds);

        empIds.putIfAbsent("Ayush",65423);
        System.out.println(empIds);

        empIds.putIfAbsent("Billu",65423);
        System.out.println(empIds);

        empIds.remove("Billu");
        System.out.println(empIds);

    }
}
