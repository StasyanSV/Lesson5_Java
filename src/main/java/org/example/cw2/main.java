package org.example.cw2;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,1,2};
        System.out.println(isDouble(arr));

    }

    public static boolean isDouble(int [] array) {
        Map<Integer,Integer> mapList = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (mapList.containsKey(array[i])) return false;
            else mapList.put(array[i],1);

        }
        return true;
    }
}
