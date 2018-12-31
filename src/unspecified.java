package com.company;

/**This program is about which reads an unspecified number of integer arguments using Scanner Class and adds them together.
 *The program should display total of the given input number and should only consider integer value.
 * The program should display an error message if there are any non integer values
 */

import java.util.Scanner;
public class unspecified
{
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers:");

        while(input.hasNextInt())
        {
            n = input.nextInt();
            sum = sum + n;
        }
        System.out.println("Sum = " + sum);
        System.out.println("There is a special character inbetween.\n");

    }

}