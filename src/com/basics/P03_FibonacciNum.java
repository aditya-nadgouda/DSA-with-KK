package com.basics;

import java.util.Scanner;

public class P03_FibonacciNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        if ( n == 0){
            System.out.println(a);
        }
        else if (n == 1){
            System.out.println(b);
        }
        else {
            int fib = 0;
            while (n>1){
                fib = a + b;
                a = b;
                b = fib;
                n--;
            }
            System.out.println(fib);
        }



    }
}
