package com.bridgelabz.programming_construct_assignment_dls.day6;

import java.util.Scanner;

public class MonthlyPayment {
    static void monthlyPayment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P: ");
        double P= sc.nextInt();

        System.out.println("Enter the value of Y: ");
        int Y= sc.nextInt();

        System.out.println("Enter the value of R: ");
        double R= sc.nextInt();

        double n=12*Y;
        System.out.println(n);
        double r=R/(12*100);
        System.out.println(r);

        double payment= P*r/1-Math.pow((1+r),-n);
        System.out.println("Monthly payment is: " + payment);
    }

    public static void main(String[] args) {
        monthlyPayment();
    }
}
