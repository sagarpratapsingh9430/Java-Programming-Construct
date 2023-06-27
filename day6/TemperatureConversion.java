package com.bridgelabz.programming_construct_assignment_dls.day6;

import java.util.Scanner;

public class TemperatureConversion {
    static void  temperatureConversion(){

    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the temperature in degree celsius: ");
        int C= obj.nextInt();
        double  F= (C*9/5) + 32 ;
        double Temp=(F-32)*5/9;

        System.out.println("Temperature in fahrenheit: " +F);
        System.out.println("Temperature in celsius: " + Temp);
    }
}
