package com.company;

/**
 *  This program is about
 *  It accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
 *  a.Number guessed is more than original number
 *  b.Number guessed is less than original number
 *  c.Number guessed matches the original number
 */

    import java.util.Scanner;

    public class OriginalNumber {


        public static void main(String[] args) {
            int n;
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number:");

            while (input.hasNextInt()) {
                n = input.nextInt();
                if( n >=1 && n <= 100 )
                {
                    System.out.println("Number guessed matches the original number" );
                    break;
                }
                else if(n<=1 )
                {
                    System.out.println("Number guessed is less than the original number" );
                }
                else
                {
                    System.out.println("Number guessed is more than the original number" );
                }
            }

        }
    }

