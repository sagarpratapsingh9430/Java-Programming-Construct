package com.bridgelabz.programming_construct_assignment_dls.day5;

import java.util.Scanner;

public class FlipCoin {


    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();


        for (int i=0; i<number; i++){
            double random = (Math.random());
            if (random < .5){
                tails++;
            }else {
                heads++;
            }

        }

        double tailsPercentage = (tails/number)*100;
        double headsPercentage = (heads/number)*100;

        System.out.println("Tails percentage = " + tailsPercentage);
        System.out.println("Heads percentage = " + headsPercentage);
    }
}
