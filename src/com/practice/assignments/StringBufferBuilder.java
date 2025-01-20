package com.practice.assignments;

import static java.lang.Thread.sleep;

public class StringBufferBuilder {
    public static void main(String[] args) throws InterruptedException {

        //String
        //When you need an immutable string use String datatype, so that is not to be modified, plus it is memory efficient
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);//true
        //str1 and str2 will point out to same memory location, saving memory but in case of StringBuilder and StringBuffer
        //it will point to a new memory location even if the values are same.
        StringBuilder str3 = new StringBuilder("Java");//Same for StringBuffer
        StringBuilder str4 = new StringBuilder("Java");
        System.out.println(str3 == str4);//false

        //When you need a mutable string use StringBuilder/StringBuffer, i.e. when you need to change value of string without reassigning
        //
        StringBuffer str5 = new StringBuffer("Arpan");
        concat1(str1);
        concat2(str5);
        System.out.println(str1);//Hello
        System.out.println(str5);//

    }

    public static void concat1(String s) {

        s = s + " World";
    }

    public static void concat2(StringBuffer s) {
        //same for StringBuffer
        s.append(" Shah");
    }
}
