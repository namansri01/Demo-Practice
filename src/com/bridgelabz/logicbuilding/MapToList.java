package com.bridgelabz.logicbuilding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
    public static void main(String[] args) {

        Map <Integer,String> map = new HashMap<>();

        map.put(21,"Naman");
        map.put(24,"Ayush");
        map.put(20, "Yash" );

        List<Integer> empId = map.keySet().stream().toList();
        System.out.println(empId);

        List<String> empName = map.values().stream().toList();
        System.out.println(empName);

    }
}

class Emp {
    public void call(String[] args) {

    }

}