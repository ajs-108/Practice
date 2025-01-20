package com.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, Integer> map1 = new HashMap<>();
        int count = 1;
        while(true){
            map1.put(count,count*count);
            count++;
            String s = String.valueOf(count*count);
            if(s.length() == 4){
                break;
            }
        }
        System.out.println(map1);
    }
}
