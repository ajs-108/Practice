package com.practice.assignments.collections.map;

import java.util.*;

/**
 * Assignment 2: Count Word Frequency
 * ● Write a program to count the frequency of words in a paragraph using a HashMap.
 */
public class Assignment2 {

    public static void main(String[] args) {

        //Declaring paragraph
        String para = """
                An instance of HashMap has two parameters that affect its performance: initial capacity and load factor.
                The capacity is the number of buckets in the hash table, and the initial capacity is simply the 
                capacity at the time the hash table is created. The load factor is a measure of how full the hash 
                table is allowed to get before its capacity is automatically increased. When the number of entries in 
                the hash table exceeds the product of the load factor and the current capacity, the hash table is 
                rehashed ( that is, internal data structures are rebuilt ) so that the hash table has approximately 
                twice the number of buckets.""";

        String[] words = para.toLowerCase().split("[ ,.():\\n]");

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            //if word is already present in map increase the frequency by one
            if (wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            }
            //else put new word to map with frequency of one
            else {
                wordFrequencyMap.put(word, 1);
            }
        }


    }
}
