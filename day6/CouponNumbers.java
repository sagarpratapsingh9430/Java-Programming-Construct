package com.bridgelabz.programming_construct_assignment_dls.day6;

public class CouponNumbers {
    public static void main(String[] args) {
        char[] chars="LMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000;
        int random = (int) (Math.random()*max);
        StringBuffer sb = new StringBuffer();

        while (random>0){
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=sb.toString();
        System.out.println("Coupon Code: "+couponCode);
    }
}
