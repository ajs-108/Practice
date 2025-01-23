package com.practice.other;

public class StarPattern {

    public static void main(String[] args) throws InterruptedException {

        for(int h = 0; h<10; h++){

            if(h%2 == 0){
                for (int i = 1; i <= 6; i++) {
                    // inner loop to print spaces
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print(" ");
                    }
                    // inner loop to print stars
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                        Thread.sleep(100);
                    }
                    System.out.println();
                }

            }

//            if(h%2 != 0){
//                for (int i = 6-1; i >= 1; i--) {
//                    // inner loop to print spaces
//                    for (int j = 1; j <= 6 - i; j++) {
//                        System.out.print(" ");
//                    }
//                    // inner loop to print stars
//                    for (int j = 1; j <= 2 * i - 1; j++) {
//                        System.out.print("*");
//                        Thread.sleep(150);
//                    }
//                    System.out.println();
//                }
//
//            }

        }
    }
}
