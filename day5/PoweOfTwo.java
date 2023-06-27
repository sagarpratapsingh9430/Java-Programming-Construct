package com.bridgelabz.programming_construct_assignment_dls.day5;

import java.util.Scanner;

public class PoweOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++){
            int a = 2;
            System.out.println(Math.pow(a,i));

        }
    }
}
