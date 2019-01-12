package com.stackroute.wave4;


/**
 *  This program is about
 * Which accepts a number as input and check whether the given number is palindrome or not
 * If it is a palindrome then it should follow these condtions
 * a. Add all the even numbers and check whether the sum is more than 25.
 * b. Print success and failure messages for all 3 conditions
 */


public class Palindrome {
    private int sum=0;
    private int original;

    int palindromefunction(int number) //Palindrome Check
    {
        original = number;
        int reverse = 0;
        int remainder;

        /* reversal of number
         */

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;
        }
        return reverse;
    }


    int total(int reverse){
        if(original == reverse){
            if(sum < 25){
                //If it is palindrome and the sum of even numbers is less than 25");
            }
            else {
                //If it  is palindrome and the sum of even numbers is greater than 25");
            }
        }
        else {
            //If it is not palindrome");
        }
        return sum;
    }
}
