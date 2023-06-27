package com.bridgelabz.programming_construct_assignment_dls.day5;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("This is a vowel: " + ch);
                break;
            case 'e':
                System.out.println("It is a vowel: " + ch);
                break;
            case 'i':
                System.out.println("It is vowel: " + ch);
                break;
            case 'o':
                System.out.println("This is vowel: " + ch);
                break;
            case 'u':
                System.out.println("It is a vowel: "+ch);
                break;
            default:
                System.out.println("This is a consonant: " + ch);
        }
    }
}
