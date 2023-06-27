package com.bridgelabz.programming_construct_assignment_dls.day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if ((year%4==0 && year%100!=0) || (year%4==0 && year%400==0)){
            System.out.println("This is a leap year: " + year);
        }else {
            System.out.println("It is not a leap year: " + year);
        }
    }
}
