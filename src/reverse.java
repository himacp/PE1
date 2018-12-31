package com.company;

/**
 *  This program is about to reverse any string without using String Buffer.
 */
import java.util.Scanner;
public class reverse {
    public static void main(String[] args)
    {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        for( int i=str.length()-1 ; i >= 0 ; i-- )
        {
            System.out.print(str.charAt(i));
        }
    }
}

