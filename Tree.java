package task12;

import java.util.TreeMap;

import java.util.Map.Entry;

public class Tree {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("Benny",1);
        treeMap.put("Annie",2);
        treeMap.put("Daniel",3);
        treeMap.put("Cathrine",4);
        for (Entry<String,Integer> var : treeMap.entrySet()) {
            System.out.println(var);
        }

    }
    

}
