/*
HashMaps and Sets Pending
Problem

1.
Create a HashMap with name as key and rollNo as value with total 5 items

Print all the key-value
Print the value whose key length>5
Remove all key-value where key length >=6 and print all the elements after removing

2.
Create a Set and add the below values

India
Pak
China
India
Aus
Pak
Japan
Print all the elements after adding all the elements
Print the elements whose length>=3
Remove the object "India"
*/


import java.util.*;

public class HashMapAndSet {
    public static void main(String[] args) {
        System.out.println("Question no.1");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mausam", 45);
        map.put("rohit", 40);
        map.put("abhimanyu", 38);
        map.put("ashu", 10);
        map.put("intezar", 50);

        Iterator<Map.Entry<String,Integer>> hset=map.entrySet().iterator();
        while (hset.hasNext()){
            Map.Entry<String,Integer> val= hset.next();
            if(val.getKey().length()>=6) hset.remove();
            else System.out.println(val.getKey()+" "+val.getValue());
        }

        System.out.println("\n");
        System.out.println("Question no.2 ");
        Set<String> set=new LinkedHashSet<>();

        // input
        set.add("India");
        set.add("Pak");
        set.add("China");
        set.add("India");
        set.add("Aus");
        set.add("Pak");
        set.add("Japan");

        // to print all elements
        System.out.println(set);
        for(String a:set){
            if(a.length()>=3){
                //  System.out.println(a);
            }
        }
        set.remove("India");
        System.out.println(set);

    }
}
