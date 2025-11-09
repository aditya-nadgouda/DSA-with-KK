package com.basics;

import java.util.Scanner;

public class P04_CountNums {

    public static void main(String[] args) {

        long num = 7274577237575757L;

        int n = 7;
        int count = 0;
        while (num > 0){
            int lastDigit = (int) (num % 10);
            if (lastDigit == n){
                count ++ ;
            }
            num = num / 10;
        }

        System.out.println(count);

    }
}
