package com.basics;

import java.util.Scanner;

public class P02_CaseCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper case letter");
        }
        else {
            System.out.println("Lower case letter");
        }

    }
}
