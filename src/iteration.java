package com.company;
/**
 *  This program is about
 *   nth iteration
 */
import java.util.Scanner;

public class iteration {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Number:");
            int n=input.nextInt();
            for( int i=1; i<=n; i++ )
            {
                for( int j=1; j<=i ;j++ )
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
