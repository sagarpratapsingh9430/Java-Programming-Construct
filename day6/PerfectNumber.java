package com.bridgelabz.programming_construct_assignment_dls.day6;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        int num = 28;

        for (int i=0; i<=num/2; i++){
            if (num%i==0){
                sum = sum + i;
            }
        }

        temp = num;
        if (temp==sum){
            System.out.println("This is a perfect number: " + sum);
        }else {
            System.out.println("It is mot a perfect number: " + sum);
        }
    }
}
