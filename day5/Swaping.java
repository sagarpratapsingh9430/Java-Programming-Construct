package com.bridgelabz.programming_construct_assignment_dls.day5;

public class Swaping {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("Before swapping the value of x and y is: " + x +"," + y);

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping the value of x and y is: " + x +"," + y);
    }

}
