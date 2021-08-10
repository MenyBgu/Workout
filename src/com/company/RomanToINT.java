package com.company;

import java.util.HashMap;

public class RomanToINT {
    public static int romanToInt(String s) {
        /*HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);      //MCMXCIV -> 1000 100 1000 10 100 1 5 -> 1000 + 1000-100 + 100-10 + 5-1 = 1994
        romanMap.put("L", 50);      //XIX -> 10 1 10 ->
        romanMap.put("C", 100);     //XXII
        romanMap.put("D", 500);      //IX -> 1 10-> 10-1= 9
        romanMap.put("M", 1000); */    //IV -> 1 5 -> 5-1 = 4

        char[] sToChar = s.toCharArray();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < sToChar.length - 1; i++) {
            if (calculateChar(sToChar[i]) >= calculateChar(sToChar[i + 1])) {
                temp = calculateChar(sToChar[i]) - temp;
                sum += temp;
                temp = 0;
            } else {
                temp = calculateChar(sToChar[i]);
            }
        }

        if (sToChar.length>1 && calculateChar(sToChar[sToChar.length - 2]) > calculateChar(sToChar[sToChar.length - 1])) {
            sum += calculateChar(sToChar[sToChar.length-1]);
        } else {
            temp = calculateChar(sToChar[sToChar.length - 1]) - temp;
            sum += temp;
        }
        return sum;
    }

    public static int calculateChar(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        //System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}
