package com.practice.assignments;

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
        StringBuffer str5 = new StringBuffer("HI");
        concat1(str1);
        concat2(str5);
        System.out.println(str1);//Hello
        System.out.println(str5);//Hi Hello

        //Below code shows the difference between StringBuilder and StringBuffer through the threads
        //In case of StringBuffer as it is synchronized the values are printed correctly
        //But in case of StringBuilder it prints inconsistent or corrupted values

        // StringBuilder (not synchronized) task --> printing values from 0 to 39
        StringBuilder stringBuilder = new StringBuilder("");
        Runnable task1 = () -> {
            for (int i = 0; i < 40; i++) {
                stringBuilder.append(i + " ");
            }
            System.out.println("StringBuilder: " + stringBuilder.toString());
        };

        // StringBuffer (synchronized)
        StringBuffer stringBuffer = new StringBuffer("");
        Runnable task2 = () -> {
            for (int i = 0; i < 40; i++) {
                stringBuffer.append(i + " ");
            }
            System.out.println("StringBuffer: " + stringBuffer.toString());
        };

        // Creating threads for StringBuilder; Assigning same task to two threads to find out the difference
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);

        // Creating threads for StringBuffer
        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task2);

        // Starting threads for StringBuilder
        thread1.start();
        thread2.start();

        // Starting threads for StringBuffer
        thread3.start();
        thread4.start();
    }

    public static void concat1(String s) {

        s = s + " World";
    }

    public static void concat2(StringBuffer s) {

        s.append(" Hello");
    }

}
