package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter nos.");
        Scanner sc = new Scanner(System.in);
        int num;
        int reverse = 0;
        num = sc.nextInt();
        while (num != 0) {
            int Remainder = num % 10;
            reverse = reverse * 10 + Remainder;
            num = num / 10;
        }
        System.out.println("reversed no. is=" + reverse);
    }
}
