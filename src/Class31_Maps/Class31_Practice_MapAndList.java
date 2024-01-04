package Class31_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class31_Practice_MapAndList {
    public static void main(String[] args) {
//        Manager name -> list of employees names Mapping
//        String
        Map<String, List<String>> managerAndEmployees = new HashMap<>();
//        Elon -> [Steve, Alice, Bill, Jane]

        List<String>elonsEmployees = new ArrayList<>();
        elonsEmployees.add("Steve");
        elonsEmployees.add("Alice");
        elonsEmployees.add("Bill");
        elonsEmployees.add("Jane");

        managerAndEmployees.put("Elon", elonsEmployees);

        System.out.println(managerAndEmployees);

//        Tatiana -> [Artyom, Jason, Jane, Solya]

        List<String>tatianasEmployees = new ArrayList<>();
        tatianasEmployees.add("Artyom");
        tatianasEmployees.add("Jason");
        tatianasEmployees.add("Jane");
        tatianasEmployees.add("Solya");

        managerAndEmployees.put("Tatiana", tatianasEmployees);

        System.out.println(managerAndEmployees);
    }
}
