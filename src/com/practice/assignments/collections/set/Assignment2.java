package com.practice.assignments.collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Assignment 2: Remove Duplicates
 * ● Write a program to remove duplicate words from a sentence using a Set.
 */
public class Assignment2 {

    public static void main(String[] args) {

        String sentence = "I am Arpan Shah I am doing coding in java.";
        System.out.println("Sentence with duplicate words: \n"+sentence);

        sentence = removeDuplicates(sentence);

        System.out.println("\nSentence after removing duplicate words: \n"+ sentence);
    }

    public static String removeDuplicates(String sentence){

        Set<String> words = new LinkedHashSet<>(Arrays.asList(sentence.split(" ")));
        sentence = String.join(" ", words);
        return sentence;
    }
}
