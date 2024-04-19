package task12;

import java.util.ArrayList;

public class ArrList {
    
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Hello");
        arrList.add("Good");
        arrList.add("Morning");
        System.out.println("Array List: "+arrList);
        arrList.removeAll(arrList);
       System.out.println("Array List After Removal: "+arrList);
    }


}
