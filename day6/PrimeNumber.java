package com.bridgelabz.programming_construct_assignment_dls.day6;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 13;
        int count =0;

        for (int i=2; i<n/2; i++){
            if (n%i==0){
                count++;
            }
        }

        if (count>1){
            System.out.println("It is not a prime number: " + n);
        }else {
            System.out.println("This is a prime number: " + n);
        }
    }
}
