package task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import java.util.Map.Entry;

public class Tree {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"Benny");
        treeMap.put(2,"Annie");
        treeMap.put(3,"Cathrine");
        treeMap.put(4,"Cathrine");
        System.out.println("Printing based on sorted ID");
        for (Entry<Integer,String> var : treeMap.entrySet()) {
            System.out.println(var);
        }

        List<Map.Entry<Integer,String>> list=new ArrayList<>(treeMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("Printing based on sorted name");
        for (Entry<Integer,String> var : list) {
            System.out.println(var);
        }

    }
    

}
