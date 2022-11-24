package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("enter nos.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num % i ==0){
                sum = sum +i;
            }
        }if(sum == num){

            System.out.println(+num +" " + "is perfect no.");

        }else {
            System.out.println(+num +" " + "is not a perfect no.");

        }

    }
}