package com.bridgelabz.programming_construct_assignment_dls.day5;

import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.print(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
