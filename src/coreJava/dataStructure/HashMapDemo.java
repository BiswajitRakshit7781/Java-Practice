package coreJava.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("a",10);
        hash.put("b",20);
        hash.put("c",30);
        System.out.println("Size of map is : " + hash.size());
        System.out.println(hash);
        if(hash.containsKey("a")){
            int a = hash.get("a");
            System.out.println("Value for key \"a\" is " +a);
        }
        for (String i : hash.keySet()){
            System.out.println("Key : "+ i + ", Value : " + hash.get(i));
        }
        for (Map.Entry<String, Integer> entry : hash.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
    }
}