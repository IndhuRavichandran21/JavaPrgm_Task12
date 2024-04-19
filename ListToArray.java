package task12;

import java.util.ArrayList;

public class ListToArray {
   
    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();        
        arrList.add("Hello");
        arrList.add("Good");
        arrList.add("Morning");
      
        // String []arr=arrList.toArray(new String[arrList.size()]);
        // for (String var : arr) {
        //     System.out.println(var);
        // }
        
        String []arr1=new String[arrList.size()];
        arrList.toArray(arr1);

        for (String var : arr1) {
            System.out.println(var);
        }
       
        
    }
   
}
