package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i=2;
        System.out.println("enter nos.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag =false;
        while (i<num/2){
            if(num%i==0){
                flag=true;
                break;
            }
            ++i;
        }if(!flag){
            System.out.println(+num+" "+ "is a prime no.");
        }else{
            System.out.println(+num+" "+ "is not a prime no.");
        }
    }
}
