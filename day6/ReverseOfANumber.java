package com.bridgelabz.programming_construct_assignment_dls.day6;

public class ReverseOfANumber {
    public static void main(String[] args) {
        int n = 456;
        int rem;
        int reverseNumber = 0;

        for (int i=0; i<n; i++){
            rem = n%10;
            reverseNumber = reverseNumber * 10 + rem;
            n/=10;
        }
        System.out.println(reverseNumber);
    }
}
