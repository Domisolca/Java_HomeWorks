package HomeWorks_project;

import java.util.HashMap;

public class HomeWork5 {
    
    public static void main(String[] args) {
        
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Zero", "0");
        hm.put("One", "1");
        hm.put("Two", "2");
        hm.put("Three", "3");
        hm.put("Four", "4");
        hm.put("Five", "5");

        System.out.println("1"+"*".repeat(20));

        hm.forEach((k, v) -> System.out.println(k + ": " + v));

        for (String s: hm.keySet()) {
            hm.compute(s, (k, v) -> v +"!");
        }
        
        System.out.println("2"+"*".repeat(20));

        System.out.println(hm);

        HashMap<String, String> hm1 = new HashMap<>();

        hm1.put("Zero", "000");
        hm1.put("One", "111");
        hm1.put("Two", "222");
        hm1.put("Three", "333");
        hm1.put("Six", "666");
        hm1.put("Seven", "777");

        for (String k: hm1.keySet()) {
            hm1.merge(k, hm.getOrDefault(k, "No"), (v1, v2) -> v1 + "+" + v2);
        }
        System.out.println("3"+"*".repeat(20));

        hm1.forEach((k, v) -> System.out.println(k + ": " + v));;
    }
}
