package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(faqtoriali(20));

    }

    public static long faqtoriali(int a) {
        if (a == 0) {
            return 1;
        }else
            return a*faqtoriali(a-1);



    }
}
