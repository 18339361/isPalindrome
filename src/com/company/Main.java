package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int original = number;
        int reverse = 0;

        while(number > 0){
            reverse = (reverse*10) + (number % 10);
            number /= 10;
        }

        if(original == reverse){
            return true;
        }
        return false;
    }
}
