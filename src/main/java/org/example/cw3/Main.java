package org.example.cw3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "LVIII";
        String text2 = "MCMXCIV";
        System.out.println(translateNum(text));
        System.out.println(translateNum(text2));


    }

    public static int translateNum(String str) {
        Map<Character, Integer> mapList = new HashMap<>();
        mapList.put('I', 1);
        mapList.put('V', 5);
        mapList.put('X', 10);
        mapList.put('L', 50);
        mapList.put('C', 100);
        mapList.put('D', 500);
        mapList.put('M', 1000);
        int sum = mapList.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length()-1; i++) {
            if(mapList.get(str.charAt(i+1)) > mapList.get(str.charAt(i))){
                sum -= mapList.get(str.charAt(i));
            } else sum += mapList.get(str.charAt(i));
        }
        return  sum;
    }
}
