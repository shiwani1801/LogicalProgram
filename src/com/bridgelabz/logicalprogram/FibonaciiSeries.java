package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class FibonaciiSeries {
        public static void main(String[] args) {
            System.out.println("enter nos.");
            Scanner sc=new Scanner(System.in);
            int num;
            num=sc.nextInt();
            int i=1;
            int firstnum=0;
            int secondnum=1;

            while (i<=num){
                System.out.println(firstnum + " ");
                int nextnum=firstnum + secondnum;
                firstnum = secondnum;
                secondnum=nextnum;
                i++;


            }
        }
    }
