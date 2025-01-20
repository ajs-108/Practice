package com.practice.other;

import java.util.HashMap;
import java.util.Map;

//Check if all characters have equal number of occurrences
public class StringProblem1 {
    public static boolean areOccurrencesEqual(String s) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] c = s.split("");
        for(String ch:c){
            if(!map.containsKey(ch)){
                map.put(ch,frequency(s,ch));
            }
        }
        boolean b = false;
        int value = map.get(c[0]);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(value == entry.getValue()){
                b = true;
            }
            else{
                b = false;
                break;
            }
        }
        return b;

    }
    public static int frequency(String s, String ch){
        int count=0;
        String[] c = s.split("");
        for(String i: c){
            if(i.equals(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){

        System.out.println(areOccurrencesEqual("abacbc"));
    }
}
