package com.basics;

import java.util.Scanner;

public class P01_LargestOf3Num {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

// 1
        int max = a;

        if (b > a){
            max = b;
        }
        if (c>b){
            max = c;
        }

        System.out.println(max);

        // 2

        int maxx = Math.max(c,Math.max(a,b));

        System.out.println(maxx);

    }
}
