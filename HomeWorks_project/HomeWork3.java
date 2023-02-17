package HomeWorks_project;

import java.util.ArrayList;

public class HomeWork3 {
    
    public static void main(String[] args) {
        
        System.out.println("1" + "*".repeat(20));

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Желтый");
        list1.add("Зеленый");
        list1.add("Красный");
        list1.add("Голубой");
        list1.add("Белый");

        list1.forEach(n -> System.out.println(n));

        System.out.println("2" + "*".repeat(20));

        for (int i = 0; i < list1.size(); i++) {
            list1.set(i, list1.get(i) + "!");   
        }

        System.out.println(list1);

        System.out.println("3" + "*".repeat(20));

        list1.add(0, "Серый");

        System.out.println(list1);

        System.out.println("4" + "*".repeat(20));

        System.out.println(list1.get(1));

        System.out.println("5" + "*".repeat(20));

        list1.set(1, "Черный");

        System.out.println(list1);

        System.out.println("6" + "*".repeat(20));

        list1.remove(2);

        System.out.println(list1);

        System.out.println("7" + "*".repeat(20));

        for (int i = 0; i < list1.size(); i++) {
            String el = list1.get(i); 
            
            if (el.equals("Красный!") ){
                System.out.println(i);
             };    
        }

        System.out.println("8" + "*".repeat(20));

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list2.add(list1.get(i));   
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("9" + "*".repeat(20));

        list1.retainAll(list2);

        System.out.println(list1);
        System.out.println(list2);
    }
}
